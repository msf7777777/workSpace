package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet("/ServletCookie4")
public class ServletCookie4 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");
        response.getWriter().print("ServletCookie4 获取cookie 且 打印! <hr/>");
        // 需求: 获取cookie 且 打印
        // 获取所有的cookie, 返回类型是数组
        Cookie[] cookieArr = request.getCookies();
        // 使用数组前必须判断
        if(cookieArr!=null) {
            // 遍历所有的cookie
            for (Cookie cookie : cookieArr) {
                // 获取cookie的name和value
                String name = cookie.getName();
                String value = cookie.getValue();
                // 对特殊字符值进行解码
                value = URLDecoder.decode(value, "utf-8");
                // 打印
                response.getWriter().print("cookie: "  +name + " ==== " + value + "<br/>");
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}