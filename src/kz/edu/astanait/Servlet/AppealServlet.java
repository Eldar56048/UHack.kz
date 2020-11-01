package kz.edu.astanait.Servlet;

import kz.edu.astanait.Controllers.AppealController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "AppealServlet", urlPatterns = "/appeal")
public class AppealServlet extends HttpServlet {
    AppealController controller = new AppealController();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "about":{
                controller.aboutAppeal(req,resp);
                break;
            }
            default:{
                resp.sendRedirect("404.jsp");
                break;
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "add":{
                controller.addAppeal(req,resp);
                break;
            }
            case "update":{
                controller.AppealUpdate(req,resp);
                break;
            }
            case "delete":{
                controller.appealDelete(req,resp);
                break;
            }
            case "get":{
                controller.getAppealByIdAndCode(req,resp);
                break;
            }
            default:{
                resp.sendRedirect("404.jsp");
                break;
            }
        }
    }
}
