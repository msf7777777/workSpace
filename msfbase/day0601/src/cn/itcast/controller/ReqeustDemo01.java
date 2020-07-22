package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReqeustDemo01")
public class ReqeustDemo01 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求1 获取请求方式
        String method = request.getMethod();
        // 需求2 获取资源路径 uri
        String uri = request.getRequestURI();
        // 需求3 获取资源路径 url
        StringBuffer url = request.getRequestURL();
        // 需求4 获取请求参数后面的url
        String queryString = request.getQueryString();
        // 需求5 获取项目路径
        String contextPath = request.getContextPath();

        response.getWriter().print("请求方式 method = " + method + "<br/>");
        response.getWriter().print("获取资源路径 uri = " + uri + "<br/>");
        response.getWriter().print("获取资源路径 url = " + url + "<br/>");
        response.getWriter().print("获取路径后面的请求参数 queryString = " + queryString + "<br/>");
        response.getWriter().print("获取项目路径 contextPath = " + contextPath + "<br/>");

        // response.sendRedirect("/day0601/login.html");
        response.sendRedirect(request.getContextPath() + "/login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}