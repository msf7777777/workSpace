package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RespServlet01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 重定向:  用户通过浏览器访问 RespServlet01 让其重定向到 RespServlet02
        System.out.println("访问到了:RespServlet01.....");
        //1. 设置响应的状态码
        //resp.setStatus(302);

        //2. 设置 重定向的路径: Location
        //resp.setHeader("Location","/day09_web_project/RespServlet02");   跳转本地项目内的资源
       // resp.setHeader("Location", "http://www.baidu.com");  跳转 外部的网络的资源


        //  --------------------以上是一个完整的 复杂的写法------------------------------
        //resp.sendRedirect("/day09_web_project/RespServlet02");
        resp.sendRedirect("http://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req, resp);
    }
}
