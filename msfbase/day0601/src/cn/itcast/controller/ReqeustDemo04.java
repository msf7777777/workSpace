package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReqeustDemo04")
public class ReqeustDemo04 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 将request作为容器使用: 取数据
        String username = (String) request.getAttribute("username");

        response.getWriter().print("ReqeustDemo04 将request作为容器使用: 取数据 username = " + username);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}