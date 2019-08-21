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

/**
 * @author zhuof
 * @company
 * @date 2019/8/20 11:45
 * @description
 */
@WebServlet("/link")
public class LinkJdbc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
            String sql = "select* from user;";
            // ��ȡPreparedStatement

            Statement statement=conn.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            List<User> list=new ArrayList<>();
            while (rs.next()){
                User user=new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                list.add(user);
            }
            req.setAttribute("list",list);
            rs.close();
            statement.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
