package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReqServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
                String getMethod()  ;  获取请求方式
				String getRequestURI() ; 获取请求URI地址
				StringBuffer getRequestURL()   获取请求URL地址
				String getRemoteAddr()  ；  获取客户端的IP地址
				String getQueryString()  ；  获取请求参数的字符串
         */
        String method = req.getMethod(); // GET

        String requestURI = req.getRequestURI(); // 获取不含域名,协议的 资源路径
        StringBuffer requestURL = req.getRequestURL();  // 获取完整的url的路径  不包含请求参数
        String remoteAddr = req.getRemoteAddr(); //  127.0.0.1
        String queryString = req.getQueryString(); // 获取 请求路径上  ? 后面的内容

        System.out.println(method);
        System.out.println(requestURI);
        System.out.println(requestURL);
        System.out.println(remoteAddr);
        System.out.println(queryString);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
