package com.itheima.web;

import com.itheima.service.UserService;
import com.itheima.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建Spring容器
        // 方式1
        WebApplicationContext context1 =
                (WebApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        // 方式2
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());

        //加载Service
        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService + "*******");
        //调用Service
        userService.serviceLogin();

        resp.getWriter().println("MSF.......登陆成功、、、、、、、、、、、");
        resp.getWriter().println("login success.......");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //加载Service
        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService + "msfmsfmsfmsfmsfmsfmsfmsf");
        //调用Service
        userService.serviceLogin();

        resp.getWriter().println("MSF.......登陆成功、、、、、、、、、、、");
        resp.getWriter().println("login success.......");
    }
}
