package com.dfbz.view;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/to_login")
public class LoginUI extends HttpServlet {
    private static final long serialversionUID = 4283668589292241159L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Object msg = req.getAttribute("msg");
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<meta charset='UTF-8'>") ;
        out.append("<title>用户登录</title>");
        out.append("</head>");
        out.append("<body>");

        if (msg != null) {
            out.append("登录消息:" + msg);
        }
        out.append("<form action='login1' method='post'>");
        out.append("用户名： <input name='username' type='text'> <br/>");
        out.append("密码： <input name='password' type='password'> <br/>");
        out.append("<input type='submit' value='登录'>");
        out.append("</form>");
        out.append("</body>");
        out.append("</html>");
    }



}
