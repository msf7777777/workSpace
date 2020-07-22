package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ServletSession2")
public class ServletSession2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 将session作为容器使用: 存数据
        // 1 获取session对象
        HttpSession session = request.getSession();
        // 2 保存数据
        session.setAttribute("username", "刘德华");

        response.getWriter().print("ServletSession2 将session作为容器使用: 存数据");

        // 3 问题: 默认情况下, 保存session唯一标志的cookie, 浏览器关闭时过期, 目的: 浏览器关闭时能否不销毁
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60 * 24 * 30); // 保存一个月
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}