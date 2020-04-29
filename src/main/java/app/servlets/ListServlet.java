package app.servlets;

import app.entities.Users;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import java.util.ArrayList;

public class ListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        ArrayList<Users> usersList = Model.getInstance().getListOfUsers();
        request.setAttribute("usersList", usersList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(request, response);
    }
}
