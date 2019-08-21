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
        out.print("�õ�����ķ�ʽ��"+req.getMethod()+"<br>");
        out.print("�õ������URI��"+req.getRequestURI()+"<br>");
        out.print("�õ������URL��"+req.getRequestURL()+"<br>");
        out.print("�õ������Э��Ͱ汾��"+req.getProtocol()+"<br>");
        out.print("�õ���ǰ��Ŀ�ķ��ʵ�ַ��"+req.getContextPath()+"<br>");
        out.print("�õ��ͻ��˵�IP��ַ��"+req.getRemoteAddr()+"<br>");
        out.print("�õ���ǰServlet�ķ��ʵ�ַ��"+req.getServletPath()+"<br>");
    }
}
