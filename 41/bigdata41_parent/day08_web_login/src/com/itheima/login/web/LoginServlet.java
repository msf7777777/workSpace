package com.itheima.login.web;

import com.itheima.login.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //1. 接收前端的请求参数
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            //2. 判断前端参数是否传递正常
            if (username == null || password == null) {
                // 不管是谁等于null  都认为前端没有传递参数, 直接响应登录失败

                resp.getWriter().println("login fail ......"); // 今日不要使用中文数据传输, 否则会出现中文乱码

                return;  // 终止当前程序, 不允许往后执行
            }

            //3. 如果没有进入if语句, 说明 请求参数 传递正常的,根据用户名和密码验证是否登录成功: 调用service层
            LoginService loginService = new LoginService();
            Boolean flag = loginService.login(username, password);

            //4. 判断登录状态:
            if(flag){

                resp.getWriter().println("login successful ......");

            }else {
                resp.getWriter().println("login fail ......");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req, resp);
    }
}
