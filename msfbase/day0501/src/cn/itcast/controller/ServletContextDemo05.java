package cn.itcast.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo05")
public class ServletContextDemo05 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        // 取数据
        ServletContext servletContext = getServletContext();
        String name = (String) servletContext.getAttribute("name");

        response.getWriter().print("ServletContextDemo05 取出数据: name = " + name);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}