package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/ServletCookie3")
public class ServletCookie3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 创建cookie, 携带特殊字符, 发送cookie
        // 针对特殊字符进行编码
        Cookie cookie = new Cookie("hi", URLEncoder.encode("hello world", "utf-8"));

        response.addCookie(cookie);

        response.getWriter().print("ServletCookie3  创建cookie, 携带特殊字符, 发送cookie!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}