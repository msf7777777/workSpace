package com.itheima.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo03Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1. 获取servletContext对象
        ServletContext servletContext = this.getServletContext();

        //2. 向这个对象设置值
        servletContext.setAttribute("cid",1);
        servletContext.setAttribute("cname","化妆品");

        //3. 获取这个数据
        Object cid = servletContext.getAttribute("cid");
        Object cname = servletContext.getAttribute("cname");

        System.out.println("Demo03:"+cid+"---"+cname);

        System.out.println("111111");
        System.out.println("222222");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
