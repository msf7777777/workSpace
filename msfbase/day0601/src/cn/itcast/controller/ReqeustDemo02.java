package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/ReqeustDemo02")
public class ReqeustDemo02 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 获取所有请求头中的信息
        // 1 获取所有请求头的key
        Enumeration<String> en = request.getHeaderNames();
        // 2 遍历所有的key
        while(en.hasMoreElements()) {
            // 2.1 获取key
            String key = en.nextElement();
            // 2.2 根据key 获取对应的值
            String val = request.getHeader(key);
            // 2.3 打印
            response.getWriter().print(key + " ***************** " + val + "<br/>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}