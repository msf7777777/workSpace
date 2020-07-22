package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 1 获取用户名
        String username = request.getParameter("username");

        System.out.println("请求方式: " + request.getMethod() + ", 请求参数: username = " + username);

        // 2 模拟数据库校验
        if("zhangsan".equals(username) || "lisi".equals(username)) {
            // 返回1, 表示 用户名被占用
            response.getWriter().print("1");
        } else {
            // 返回0, 表示 用户名可以用
            response.getWriter().print("0");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}