package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;

public class AddServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        User user = new User(name, pass);
        Model usersList = Model.getInstance();
        if (usersList.addUser(user)) {
            doGet(request, response);
        } else {
            PrintWriter writer = response.getWriter();
            try {
                writer.println("<h1>Duplicate user</h1>");
            } finally {
                writer.close();
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/add.jsp");
        dispatcher.forward(request, response);
    }
}
