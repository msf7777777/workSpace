package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ResponseDemo07")
public class ResponseDemo07 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");

        // 字符输出流
        PrintWriter writer = response.getWriter();
        writer.print("hello world");
        writer.write("<br/>");
        writer.write("hello world");
        writer.write("<br/>");
        // 问题: print 和 write 有没有区别? 如果都输出字符串 没有区别

        writer.print(97); // 97
        writer.write("<br/>");
        writer.write(97); // a
        // 问题: print 和 write 输出整型值 有没有区别? 有区别, 使用write输出,会将整型值转成ascall码输出
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}