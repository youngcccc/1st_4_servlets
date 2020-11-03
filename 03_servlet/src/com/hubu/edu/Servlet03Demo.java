package com.hubu.edu;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author young
 * @create 2020-11-01-20:15
 * @description
 */
@WebServlet(name = "Servlet03Demo")
public class Servlet03Demo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double r = Double.parseDouble(request.getParameter("x"));
        Double C= 3.14*2*r;
        Double S= 3.14*r*r;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out= response.getWriter();
        out.println("圆的半径为："+C);
        out.println("圆的面积为："+S);
    }
}