package com.itheima.login.web;

import com.itheima.login.service.LoginService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // 初始化的操作
        ServletContext servletContext = this.getServletContext();

        servletContext.setAttribute("num_cnt",0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        try {
            //1. 接收前端请求参数
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            //2. 判断请求参数是否为null. 如果为null, 直接返回登录失败
            if (username == null || password == null) {
                resp.getWriter().println(
                        "哥们, 您的用户名或密码错误, 请重新<a href='/day09_web_project/login.html'>登录</a>.....");

                return;
            }

            //3. 调用service层, 验证是否登录成功
            LoginService loginService = new LoginService();

            Boolean flag = loginService.login(username, password);


            //4. 验证是否登录成功
            if (flag) {
                // 说明登录成功
                //1. 获取servletContext对象
                ServletContext servletContext = this.getServletContext();
                // 知道为什么不用int类型吗?  包装类型可以接收null
                //2. 获取原有登录人数, 对登录人数 +1 操作 然后在设置会servletContext中
                Integer num_cnt =(Integer) servletContext.getAttribute("num_cnt");
                if(num_cnt == null){
                    num_cnt = 0;
                }
                num_cnt++;
                servletContext.setAttribute("num_cnt",num_cnt);

                //3. 定时刷新的操作
                resp.setHeader("Refresh","5;url=/day09_web_project/CheckNumServlet");

                resp.getWriter().println("恭喜你, 登录成功了,5s后跳转到登录人数页......");
            } else {
                resp.getWriter().println("哥们, 您的用户名或密码错误, 请重新<a href='/day09_web_project/login.html'>登录</a>.....");
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
