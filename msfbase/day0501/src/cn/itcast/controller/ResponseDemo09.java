package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResponseDemo09")
public class ResponseDemo09 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        // 通知浏览器使用utf-8进行解码
        response.setContentType("text/html;charset=utf-8");

        // 字节流: 解决浏览器的中文乱码
        ServletOutputStream out = response.getOutputStream();
        // 对输出的文字使用utf-8编码
        out.write("字节流中文".getBytes("utf-8"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}