package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResponseDemo03")
public class ResponseDemo03 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        response.getWriter().print("<h1>支付成功, 3秒后 跳转到成功后的欢迎页面!</h1>");
        // refresh响应头信息: 秒数;url=资源路径, 含义: 到指定秒数后, 刷新跳转到新页面上去
        response.setHeader("refresh", "10;url=/day0501/success.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}