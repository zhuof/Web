package com.dfbz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhuof
 * @company
 * @date 2019/8/19 19:51
 * @description
 */
@WebServlet(name = "Demo1RequestLineServlet", urlPatterns = "/demo1")
public class Demo1RequestLineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.print("得到请求的方式："+req.getMethod()+"<br>");
        out.print("得到请求的URI："+req.getRequestURI()+"<br>");
        out.print("得到请求的URL："+req.getRequestURL()+"<br>");
        out.print("得到请求的协议和版本："+req.getProtocol()+"<br>");
        out.print("得到当前项目的访问地址："+req.getContextPath()+"<br>");
        out.print("得到客户端的IP地址："+req.getRemoteAddr()+"<br>");
        out.print("得到当前Servlet的访问地址："+req.getServletPath()+"<br>");
    }
}
