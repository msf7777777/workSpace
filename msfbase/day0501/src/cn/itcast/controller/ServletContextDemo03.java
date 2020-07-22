package cn.itcast.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo03")
public class ServletContextDemo03 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        // 需求: 通过ServletContext对象 获取项目内资源的绝对路径
        // 1 获取核心对象
        ServletContext servletContext = getServletContext();
        // 2 获取文件的绝对路径
        String aPath = servletContext.getRealPath("/a.txt");
        response.getWriter().print("apath = " + aPath + "<br/>");

        String bPath = servletContext.getRealPath("/WEB-INF/b.txt");
        response.getWriter().print("bPath = " + bPath + "<br/>");

        String cPath = servletContext.getRealPath("/WEB-INF/classes/c.txt");
        response.getWriter().print("cPath = " + cPath + "<br/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}