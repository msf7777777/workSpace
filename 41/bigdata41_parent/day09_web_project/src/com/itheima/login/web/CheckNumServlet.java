package com.itheima.login.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckNumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //1. 获取servletContext对象
        ServletContext servletContext = this.getServletContext();

        //2. 获取登录人数
        Object num_cnt = servletContext.getAttribute("num_cnt");

        //3. 响应即可
        resp.getWriter().println("恭喜您, 您是今日第"+num_cnt+"个登录成功的人员");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req, resp);
    }
}
