<%@ page import="java.util.ArrayList" %>
<%@ page import="app.entities.Users" %><%--
  Created by IntelliJ IDEA.
  User: book
  Date: 29.04.2020
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of users</title>
</head>
<body>
<h1>List of users</h1>
<ul>
<%
    ArrayList<Users> usersList = (ArrayList<Users>) request.getAttribute("usersList");
    if (usersList.isEmpty()) {
        out.println("<h2> Users list is empty now</h2>");
    } else {
        for (Users u : usersList) {
            out.println("<li>" + u.getName() + "</li>");
        }
    }
%>
</ul>
</body>
</html>
