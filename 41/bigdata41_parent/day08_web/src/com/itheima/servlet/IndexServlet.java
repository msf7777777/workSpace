package com.itheima.servlet;

import javax.servlet.*;
import java.io.IOException;

public class IndexServlet implements Servlet {
    // 用于初始化的方法: 当创建这个类的实例对象的时候, 此时 就会执行init方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("执行了init 方法 ........");
    }
    // 用于接收请求的方法, 每次发送请求过来, 都会执行一次这个service的方法
    /*
        Request : 请求
        Response : 响应

     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行了service的方法.......");
        // 响应给前端页面的操作
        servletResponse.getWriter().println("successful service execute ...........");
    }
    // 销毁的方法, 当实例对象被销毁之前, 救护先执行这个方法
    @Override
    public void destroy() {
        System.out.println("执行了destroy 方法 ........");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
