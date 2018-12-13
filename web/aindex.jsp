<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/12/11
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /*div{
            width: 100px;
            height: 100px;
            background-color: black;
        }*/
    </style>
</head>
<body>
    <div>
        <%--<%
            System.out.println(request.getAttribute("key"));
        %>--%>
        <%
            session.setAttribute("key","session");
            request.getRequestDispatcher("controller.jsp").forward(request,response);

        %>
    </div>

</body>
</html>
