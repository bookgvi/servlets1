package app.servlets;

import app.entities.Users;
import app.model.Model;

import javax.servlet.RequestDispatcher;

public class AddServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        Users user = new Users(name, pass);
        Model usersList = Model.getInstance();
        usersList.addUser(user);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/add.jsp");
        dispatcher.forward(request, response);
    }
}
