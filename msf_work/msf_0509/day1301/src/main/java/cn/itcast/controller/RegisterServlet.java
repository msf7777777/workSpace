package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet("/RegisterServlet")
public class RegisterServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        String method = request.getMethod();
        // 1 获取参数:
        String username = request.getParameter("username");
        String nickname = request.getParameter("nickname");

        System.out.println("================= 请求方式: " + method);
        System.out.println("username = " + username);
        System.out.println("nickname = " + nickname);

        // 2 模拟用户名被占用
        if("zhangsan".equals(username)) {
            response.getWriter().print("此用户名被占用请更换!");
            response.setHeader("refresh", "3;url=/form2.html");
        }
        // 3 如果没有被占用 继续执行后面的业务 注册
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}