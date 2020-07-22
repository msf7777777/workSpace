package cn.itcast.controller;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

// 普通java类为了建立和servlet的关系: 需要实现servlet接口
// 为了让服务器识别 当前servlet, 需要在web.xml中配置, web.xml是当前项目的配置文件
public class ServletDemo01 implements Servlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("访问 ServletDemo01 的 service 方法... ..." + new Date().toLocaleString());

        // 向浏览器输出内容
        // 问题: 浏览器出现了中文乱码
        // 原因: 当前项目使用 utf-8编码, 浏览器使用gbk解码, 编解码不一致导致的乱码
        // 解决: 就是 让浏览器和服务器的编码集保持一致
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().print("访问 ServletDemo01 的 service 方法 utf-8... ..." + new Date().toLocaleString());
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
