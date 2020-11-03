package com.hubu.edu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author young
 * @create 2020-11-01-15:50
 * @description
 */
@WebServlet(name = "servlet02Demo")
public class servlet02Demo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password ;
        password=request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(password.equals("123456")){
        out.print("欢迎");
        }else {
        out.print("密码错误");
    }
   }
}
