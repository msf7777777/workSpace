package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理表单内容 代码 doPost和doGet一模一样
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("访问 ServletDemo02, 请求方式: " + request.getMethod());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理表单内容 代码 doPost和doGet一模一样
        doPost(request, response);
    }
}