package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RespServlet05 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.setCharacterEncoding("UTF-8");
       // resp.setHeader("Content-Type","text/html; charset=UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        //resp.getOutputStream().write("访问到了RespServlet05....".getBytes("UTF-8"));

        resp.getWriter().println("访问到了RespServlet05....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
