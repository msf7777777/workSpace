package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/*
    自定义servlet 继承了 HttpServlet,   HttpServlet 继承了 GenericServlet, GenericServlet 实现了 Servlet接口
    HttpServlet 主要是针对 http协议做的对象
    在http协议中共有7中不同的方式, 其中 get方式和post方式比较常用
 */
public class ServletDemo01 extends HttpServlet {
    /*
        doPost 主要就是处理 post方式的额请求, 目前 你学一种: 表单 method=post
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器出现的中文乱码
        response.setContentType("text/html;charset=utf-8");

        response.getWriter().print("访问 ServletDemo01.doPost()方法 ... ..." + new Date().toLocaleString());

    }

    /*
        doGet 主要就是处理 get方式的请求,
        哪些属于get方式的请求? 1 表单 method=get, 2 通过浏览器直接访问servlet  3 超链接 <a href='ur'> 属于get方式, 4 图片 <img src=url/>
        窍门: 目前记住 主要一种post(表单 method=post) 其他的都是get方式(前提: 到目前为止)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器出现的中文乱码
        response.setContentType("text/html;charset=utf-8");

        response.getWriter().print("访问 ServletDemo01.doGet() ... ..." + new Date().toLocaleString());
    }
}