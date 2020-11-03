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
 * @create 2020-11-01-21:17
 * @description
 */
@WebServlet(name = "Servlet04Demo")
public class Servlet04Demo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name,sex,birthday,civ,intro;
    name=request.getParameter("name");
    sex=request.getParameter("sex");
    birthday=request.getParameter("birthday");
    civ=request.getParameter("civ");
    intro=request.getParameter("intro");

    request.setAttribute("name",name);
    request.setAttribute("sex",sex);
    request.setAttribute("birthday",birthday);
    request.setAttribute("civ",civ);
    request.setAttribute("intro",intro);
    response.setContentType("text/html;charset=utf-8");
    request.getRequestDispatcher("output.jsp").forward(request, response);

    }
}
