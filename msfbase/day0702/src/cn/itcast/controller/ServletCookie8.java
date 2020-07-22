package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletCookie8")
public class ServletCookie8 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 删除cookie
        // 创建cookie
        // 目的: 找到对应的cookie
        Cookie cookie = new Cookie("meinv", "");
        cookie.setPath("/");
        // 目的2: 信号 立刻删除
        cookie.setMaxAge(0);

        // 发送cookie
        // 目的3: 让浏览器去删除指定cookie, 服务器把删除的信号告诉浏览器
        response.addCookie(cookie);

        response.getWriter().print("ServletCookie8 删除cookie!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}