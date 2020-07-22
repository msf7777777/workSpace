package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RespServlet03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Refresh值的格式:  秒;url=跳转的路径
        resp.setHeader("Refresh","5;url=/day09_web_project/RespServlet04"); // 定时刷新
        resp.getWriter().println("5s ... to  respServlet04");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
