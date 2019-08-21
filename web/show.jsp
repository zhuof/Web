<%@ page import="com.dfbz.dao.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JLB
  Date: 2019/8/20
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();    //上下文路径
     String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="delete" method="post">
   <table border="1px">
       <tr>
           <td>id</td>
           <td>username</td>
           <td>password</td>
           <td>操作</td>
       </tr>
    <%
    List<User> list= (List<User>) request.getAttribute("list");
        if (list == null || list.size() < 1) {
        } else {
    for(User u:list){
    %>
       <%--<c:forEach items="<%=list%>" var="u" status="status" >--%>
    <%--<tr>--%>
        <td><div><%=u.getId()%></div></td>
        <td><%=u.getUsername()%></td>
        <td><%=u.getPassword()%></td>
        <td>
            <%--<a href="delete">删除</a>--%>
             <%--<a href='<%=basePath%>delete?id=<%=u.getId()%>'>删除</a>--%>
            <input type="hidden" name="id" value="<%=u.getId()%>">
                 <input type="submit" value="删除">
        </td>
    </tr>
       <%--</c:forEach>--%>
       <%
               }
           }
       %>

   </table>
</form>
<script>

</script>
</body>
</html>
