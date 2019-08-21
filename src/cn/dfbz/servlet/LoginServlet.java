package cn.dfbz.servlet;

import cn.dfbz.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username=request.getParameter("username");
        String pwd=request.getParameter("pwd");
        LoginService service=new LoginService();
        int flag=service.login(username,pwd);
        if (flag==0){
            request.setAttribute("msg","正在审核，请等待。");
            request.getRequestDispatcher("demo/index.jsp").forward(request,response);
        }else if (flag==1){
            request.getRequestDispatcher("demo/loginsuccess.jsp").forward(request,response);
        }else if (flag==2){
            request.setAttribute("msg","审核未通过，重新注册");
            request.getRequestDispatcher("demo/index.jsp").forward(request,response);
        }else  if (flag==3){
            request.setAttribute("msg","用户名或密码错误");
            request.getRequestDispatcher("demo/index.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
