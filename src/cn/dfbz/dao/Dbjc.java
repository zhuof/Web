package cn.dfbz.dao;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author zhuof
 * @company
 * @date 2019/8/21 16:41
 * @description
 */
public class Dbjc  {

    {
        try {
      Class.forName("com.mysql.jdbc.Driver");
    // ���ݿ������ַ���
    String url = "jdbc:mysql://localhost:3306/stu_xxx";
    // ���ݿ��û���
    String username = "root";
    // ���ݿ�����
    String password = "123456";
    // ����Connection����
    Connection conn;

            conn = DriverManager.getConnection(url, username, password);

    String sql = "select* from demo where username=? and pwd=?";
    Statement statement=conn.createStatement();
            statement.executeQuery(sql);

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
