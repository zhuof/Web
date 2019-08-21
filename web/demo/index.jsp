<%--
  Created by IntelliJ IDEA.
  User: JLB
  Date: 2019/8/21
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="form1" action="loginServlet" method="post">
    用户名：<input type="text" id="username" name="username">
    <div id="usernamemsg"></div><br>
    密码：<input type="password" id="pwd" name="pwd"><div id="pwdmsg"></div><br>
    <input type="button" value="登录" onclick="login()">
</form>
</body>
</html>
