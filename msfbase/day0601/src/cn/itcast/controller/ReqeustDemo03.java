package cn.itcast.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReqeustDemo03")
public class ReqeustDemo03 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 将request作为容器使用: 存数据
        request.setAttribute("username", "迪丽热巴");
        response.getWriter().print("ReqeustDemo03 将request作为容器使用: 存数据");
        System.out.println("ReqeustDemo03 将request作为容器使用: 存数据");
        // 需求2: 使用请求转发 跳转 demo04
        // 1 获取请求转发对象: 因为 ReqeustDemo03 和 ReqeustDemo04 都是当前项目资源, 所以请求转发不需要指定项目路径
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ReqeustDemo04");
        // 2 执行跳转动作
        requestDispatcher.forward(request, response); // 将自己的request和response对象的引用 交给新的资源 ReqeustDemo04

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}