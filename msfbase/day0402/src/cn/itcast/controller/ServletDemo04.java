package cn.itcast.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// 普通java类为了建立和servlet的关系: 需要实现servlet接口
// 为了让服务器识别 当前servlet, 需要在web.xml中配置, web.xml是当前项目的配置文件
/*
此接口定义了初始化 servlet 的方法、为请求提供服务的方法和从服务器移除 servlet 的方法。这些方法称为生命周期方法，它们是按以下顺序调用的：

    1.构造 servlet，然后使用 init 方法将其初始化。
    2.处理来自客户端的对 service 方法的所有调用。
    3.从服务中取出 servlet，然后使用 destroy 方法销毁它，最后进行垃圾回收并终止它。
 */
public class ServletDemo04 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 为了调用子类的方法, 向下转型
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().print("访问 ServletDemo04 的 service 方法, 访问的路径: " + httpServletRequest.getRequestURI());
    }

    @Override
    public void destroy() {
    }




    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
