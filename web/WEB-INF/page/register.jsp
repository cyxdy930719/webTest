<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/12/12
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form>
        用户名：<input type="text" name="username" id="uname"><span id="message"></span><br>
        密码：<input type="password" name="pwd"><br>
        确认密码：<input type="password" name="pwds"><br>
        电话：<input type="text" name="tele"><br>
        <input type="button" value="注册"><a href="login">已有账号 返回登陆</a>
    </form>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            /*使用ajax*/
            var un;
            $("#uname").blur(function(){
                un = $("#uname").val();
                $.ajax({
                    url:"doregister",
                    type:"get",
                    data:{"unames":un},
                    success:function (result) {
                        if (result=="1"){
                            $("#message").text("可以使用")
                        } else{
                            $("#message").text("用户名已经存在")
                        }
                    }
                })
            });

        });
    </script>

</body>
</html>
