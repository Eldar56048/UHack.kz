package kz.edu.astanait.Controllers;

import kz.edu.astanait.Models.Appeal;
import kz.edu.astanait.Repositories.AppealRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class AppealController {
    AppealRepository appealRepository = new AppealRepository();
    public void addAppeal(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phone_number");
        String micro_region = req.getParameter("micro_region");
        String address = req.getParameter("address");
        String appeal = req.getParameter("appeal");
        Random random = new Random();
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        String code = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        Appeal appealObj = new Appeal(name,surname,email,phoneNumber,micro_region,address,appeal,code);
        int id = appealRepository.add(appealObj);
        if(id==-1){
            req.setAttribute("AppealResult","Произошла ошибка повторите попытку");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
        String result = "Обращение успешно отправлено Ваш идентификатор обращение: "+id+" Пароль: "+code;
        req.setAttribute("AppealResult",result);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    public void AppealUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String answer = req.getParameter("answer");
        Appeal appeal = appealRepository.getAppealById(id);
        appeal.setAnswer(answer);
        appealRepository.update(appeal);
        resp.sendRedirect("answered.jsp");
    }

    public void aboutAppeal(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Appeal appeal = appealRepository.getAppealById(id);
        if(appeal==null){
            req.setAttribute("Error","Такого обращения не найдено");
            req.getRequestDispatcher("aboutAppeal.jsp");
        }
        req.setAttribute("appeal",appeal);
        req.getRequestDispatcher("/aboutAppeal.jsp").forward(req,resp);
    }

    public ArrayList<Appeal> answeredAppeals() {
        return appealRepository.getAnsweredAppeals();
    }

    public void appealDelete(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Appeal appeal = appealRepository.getAppealById(id);
        appealRepository.remove(appeal);
        resp.sendRedirect("answered.jsp");
    }

    public void getAppealByIdAndCode(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
        int id = Integer.parseInt(req.getParameter("id"));
        String code = req.getParameter("code");
        Appeal appeal = appealRepository.getAppealByIdAndCode(id,code);
        req.setAttribute("appeal",appeal);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    public ArrayList<Appeal> unansweredAppeals(){
        return appealRepository.getUnansweredAppeals();
    }

    public int getCountAllAppeal(){
        return appealRepository.getCountAllAppeal();
    }

    public int getCountAnsweredAppeal(){
        return appealRepository.getCountAnsweredAppeal();
    }
}
