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
    // 数据库连接字符串
    String url = "jdbc:mysql://localhost:3306/stu_xxx";
    // 数据库用户名
    String username = "root";
    // 数据库密码
    String password = "123456";
    // 创建Connection连接
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
