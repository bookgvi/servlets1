package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import java.util.HashSet;

public class ListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        HashSet<User> userList = Model.getInstance().getListOfUsers();
        request.setAttribute("usersList", userList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(request, response);
    }
}
