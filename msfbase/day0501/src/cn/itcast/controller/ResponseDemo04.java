package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResponseDemo04")
public class ResponseDemo04 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        System.out.println("访问 ResponseDemo04 ... ....");
        //需求: 使用重定向 跳转到 ResponseDemo05
        // 方式一: 分解式
        /*
        // 1 通知浏览器访问新资源 暗号
        response.setStatus(302);
        // 2 通知浏览器新资源的路径
        response.setHeader("location", "/day0501/ResponseDemo05");
        */

        // 方式二: 合并式
        response.sendRedirect("/day0501/ResponseDemo05");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}