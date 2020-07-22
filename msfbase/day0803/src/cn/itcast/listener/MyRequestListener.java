package cn.itcast.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

/*
    @WebListener() 代替 在web.xml中配置

    结论: 每次请求都会创建新的request对象, 当响应结束后request对象立刻销毁
 */
@WebListener()
public class MyRequestListener implements ServletRequestListener {


    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        // 1 通过事件对象 获取 事件源对象
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        // 2 打印当前请求的路径 到控制台
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        StringBuffer url = request.getRequestURL();

        System.out.println("1 新的请求创建了... ... 请求路径: " + url);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        // 1 通过事件对象 获取 事件源对象
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        // 2 打印当前请求的路径 到控制台
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        StringBuffer url = request.getRequestURL();

        System.out.println("2 新的请求被销毁了... ... 请求路径: " + url);
    }

}
