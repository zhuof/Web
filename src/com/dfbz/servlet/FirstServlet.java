package com.dfbz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/login1")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户名：" + username + ",密码：" + password);


        if (username.equals("caterpillar") && password.equals("123456")) {
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>登录成功页面</title>");
            out.println("<body>");
            out.println("登录成功！");
            out.println("</body>");
            out.println("</head>");
            out.println("</html>");
        } else {

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>登录失败页面</title>");
            out.println("<body>");
            out.println("登录失败！");
            out.println("<a src='#'>返回</a>");
            out.println("</body>");
            out.println("</head>");
            out.println("</html>");
        }


    }
}
