package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 模拟用户登录
        HttpSession session = request.getSession();
        session.setAttribute("loginUser", "zhangsan");

        response.getWriter().print("LoginServlet 模拟用户登录");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}