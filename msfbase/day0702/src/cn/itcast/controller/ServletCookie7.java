package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aaa/bbb/ServletCookie7")
public class ServletCookie7 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");


        // 目标: 设置cookie的路径
        // 创建cookie
        Cookie cookie = new Cookie("meinv", "赵敏");
        // 如果不设置路径: cookie的默认路径是 /day0702, 当前servlet的访问路径是 /day0702/ServletCookie7
        // 如果不设置路径: cookie的默认路径是 /day0702/aaa/bbb   , 当前servlet的访问路径是 /day0702/aaa/bbb/ServletCookie7
        // 规律1: 如果不设置cookie的路径, cookie的默认路径是 当前servlet的父目录
        // 规律2: 当你访问指定cookie的路径或指定路径的子目录时, 就会携带当前前cookie

        // cookie保存在客户端, 设置的路径: 是客户端路径, 指 http://ip:端口/
        cookie.setPath("/");

        // 发送cookie
        response.addCookie(cookie);
        response.getWriter().print("ServletCookie7 设置cookie的路径!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}