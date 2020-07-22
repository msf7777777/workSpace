package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@javax.servlet.annotation.WebServlet("/WorldServlet")
public class WorldServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        response.getWriter().print("WorldServlet 访问... ..." + new Date().toLocaleString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}