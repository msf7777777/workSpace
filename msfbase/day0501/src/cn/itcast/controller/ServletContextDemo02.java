package cn.itcast.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/ServletContextDemo02")
public class ServletContextDemo02 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        // 需求:通过ServletContext对象获取项目的初始化参数信息
        // 1 获取ServletContext对象
        ServletContext servletContext = getServletContext();
        // 2 获取值
        // 方式一:
        /*
        String jiaozhu = servletContext.getInitParameter("jiaozhu");
        String zongcai = servletContext.getInitParameter("zongcai");

        response.getWriter().print("教主: " + jiaozhu + "<br/>");
        response.getWriter().print("总裁: " + zongcai + "<br/>");
        */
        // 方式二
        Enumeration<String> en = servletContext.getInitParameterNames();  // 获取参数的name
        while(en.hasMoreElements()) {
            String name = en.nextElement();
            String value = servletContext.getInitParameter(name);

            response.getWriter().print(name + " === " + value + "<br/>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}