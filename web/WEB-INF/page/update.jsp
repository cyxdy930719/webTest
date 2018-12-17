<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/12/13
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="doupdate">
    <input type="text" hidden="hidden" name="id" value="${p.product_id}"><br>
    商品名称：<input type="text" name="name" value="${p.product_name}"><br>
    商品价格：<input type="text" name="price" value="${p.price}"><br>
    商品描述：<input type="text" name="des" value="${p.product_des}"><br>
    商品图片：<input type="text" name="url" value="${p.url}"><br>
    <input type="submit" value="更新">
</form>

</body>
</html>
