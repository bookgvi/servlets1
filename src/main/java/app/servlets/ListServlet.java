package app.servlets;

import java.io.PrintWriter;

public class ListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h1>QQQ</h1>");
        } finally {
            writer.close();
        }
    }
}
