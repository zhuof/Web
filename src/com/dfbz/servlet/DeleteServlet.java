package com.dfbz.servlet;

import com.dfbz.dao.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        try {
            Class.forName("com.mysql.jdbc.Driver");
        // ���ݿ������ַ���
        String url = "jdbc:mysql://localhost:3306/stu_xxx";
        // ���ݿ��û���
        String username = "root";
        // ���ݿ�����
        String password = "123456";
        // ����Connection����
        Connection conn = DriverManager.getConnection(url, username, password);
          String sql = "delete from user where id="+id+"";
            Statement statement=conn.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("link").forward(request,response);
//        response.sendRedirect(request.getContextPath()+"/link?");
    }


}
