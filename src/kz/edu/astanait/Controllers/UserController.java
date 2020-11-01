package kz.edu.astanait.Controllers;

import kz.edu.astanait.Models.User;
import kz.edu.astanait.Repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserController {
    UserRepository userRepository = new UserRepository();
    public void Login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = userRepository.getUserByUsernameAndPassword(login,password);
        if(user==null){
            req.setAttribute("LoginMessage","Invalid Username or Password");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        else {
            session.setAttribute("User",user);
            resp.sendRedirect("profile.jsp");
        }
    }

    public void Logout(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        HttpSession httpSession = req.getSession();
        httpSession.removeAttribute("User");
        resp.sendRedirect("login.jsp");
    }
}
