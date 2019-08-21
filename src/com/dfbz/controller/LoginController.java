package com.dfbz.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login2")
public class LoginController extends HttpServlet {
    private  static  final long serialversionUID=-8536154803062431000L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
         response.setCharacterEncoding("UTF-8");

         String username=request.getParameter("username");
         String password=request.getParameter("password");
        System.out.println("用户名："+username+"，密码"+password);

        response.sendRedirect(request.getContextPath()+"/to_login?msg=登录失败");

    }


}
