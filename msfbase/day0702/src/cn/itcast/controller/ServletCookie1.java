package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

@WebServlet("/ServletCookie1")
public class ServletCookie1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 创建cookie, 发送cookie
        // 创建cookie
        Cookie cookie = new Cookie("username", "zhangsan");
        Cookie cookie2 = new Cookie("age", "18");

        // 设置cookie的过期时间
        cookie.setMaxAge(60 * 60 * 24 * 7); // 保存一周
        cookie2.setMaxAge(60 * 10); // 10分钟
        // 发送cookie
        response.addCookie(cookie);
        response.addCookie(cookie2);

        response.getWriter().print("ServletCookie1  创建cookie, 发送cookie!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}