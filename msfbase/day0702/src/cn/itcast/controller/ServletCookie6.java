package cn.itcast.controller;

import cn.itcast.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletCookie6")
public class ServletCookie6 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 案例: 显示上次访问的时间
        // 1 获取当前 时间
        String now = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒").format(new Date());
        System.out.println("now = " + now);
        
        // 4 获取上次访问时间
        String lastVisitValue = CookieUtils.getCookieValue(request, "lastVisit");
        // 5 判断
        if(lastVisitValue==null) {
            // 5.1 如果 lastVisitValue 为null, 意味着 当前用户是第一次访问
            response.getWriter().print("您是首次访问, 当前时间:" + now);
        }else {
            // 5.2 否则 就意味着不是第一次访问
            response.getWriter().print("欢迎再次访问本网站, 上次访问时间是: " + lastVisitValue + ", 现在时间是" + now);
        }


        // 2 创建cookie 保存当前时间字符串
        Cookie cookie = new Cookie("lastVisit", now);
        // 3 将cookie发送给浏览器
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}