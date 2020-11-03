package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author young
 * @create 2020-10-29-19:29
 * @description
 */

public class Servlet01Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username,password;
    username=request.getParameter("username");
    password=request.getParameter("password");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out=response.getWriter();
    out.println("用户名为"+username);

    out.println("密码为"+password);
    }
}
