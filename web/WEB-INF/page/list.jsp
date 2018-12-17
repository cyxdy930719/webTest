<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.pojo.Product" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/12/12
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <a href="add">添加</a>
    <title>Title</title>
    <style>
        table{
            border:solid 1px black;
            border-collapse: collapse;
        }
        table thead tr td,table tbody tr td{
            border:solid 1px black;
            padding:5px 10px;
        }
        table tbody tr:nth-child(odd){
            background-color: darkgrey;
        }
    </style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>编号</th>
                <th>名称</th>
                <th>价格</th>
                <th>描述</th>
                <th>图片</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${lists}" var="p">
            <tr>
                <td>${p.product_id}</td>
                <td>${p.product_name}</td>
                <td>${p.price}</td>
                <td>${p.product_des}</td>
                <td>${p.url}</td>
                <td><a href="delete?product_id=${p.product_id}">删除</a> | <a href="update?product_id=${p.product_id}">修改</a></td>
            </tr>
        </c:forEach>

        <%--<%
            /*用list集合接受，但是拿值的时候默认object*/
            List<Product> list = (List<Product>) request.getAttribute("lists");
            for (Product p:list
            ) {%>
                    <tr>
                        <td><%=p.getProduct_id()%></td>
                        <td><%=p.getProduct_name()%></td>
                        <td><%=p.getPrice()%></td>
                        <td><%=p.getProduct_des()%></td>
                        <td><%=p.getUrl()%></td>
                    </tr>
           <% }

        %>--%>
        </tbody>
    </table>









</body>
</html>
