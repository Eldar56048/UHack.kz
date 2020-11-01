package kz.edu.astanait.Servlet;

import kz.edu.astanait.Controllers.UserController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "UserServlet", urlPatterns = "/login")
public class UserServlet extends HttpServlet {
    UserController controller = new UserController();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "login":{
                controller.Login(req,resp);
                break;
            }
            case "logout":{
                controller.Logout(req,resp);
                break;
            }
            default:{
                resp.sendRedirect("login.jsp");
                break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }
}
