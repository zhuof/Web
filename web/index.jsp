<%--
  Created by IntelliJ IDEA.
  User: JLB
  Date: 2019/8/19
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title></head>
<body>
 <h2>GET方式提交</h2>
  <form action="link" method="get">
    <%--用户名： <input type="text" name="username"><br/>--%>
    <%--密 码： <input type="password" name="pwd"><br/>--%>
    <input type="submit" value="登录"></form>
<hr>
<h2>POST方式提交</h2>
<form action="link" method="post">
    <%--用户名： <input type="text" name="username"><br/>--%>
    <%--密码： <input type="password" name="pwd"><br/>--%>
    <input type="submit" value="登录">
</form>
</body>
</html>