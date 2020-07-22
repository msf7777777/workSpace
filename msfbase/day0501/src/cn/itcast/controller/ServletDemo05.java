package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    1 注册 @WebServlet
    2 映射 使用 @WebServlet("/ServletDemo05")
    3 WebServlet
            属性 urlPatterns={"/ServletDemo05", "/aaa", "/bbbb"} 可以让一个servlet 映射 多个访问的路径

 */
//@WebServlet(urlPatterns={"/ServletDemo05", "/aaa", "/bbbb"})
//@WebServlet(urlPatterns={"/ServletDemo05"})
//@WebServlet(value={"/ServletDemo05"})
//@WebServlet(value="/ServletDemo05", loadOnStartup=1)
@WebServlet("/ServletDemo05")
public class ServletDemo05 extends HttpServlet {

    public ServletDemo05() {
        System.out.println("调用 ServletDemo05 的构造方法 ... ...");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("访问 ServletDemo05,  22222222 请求方式: " + request.getMethod() + ", 请求路径: " + request.getRequestURI());
    }
}