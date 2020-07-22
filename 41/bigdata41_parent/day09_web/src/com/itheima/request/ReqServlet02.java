package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ReqServlet02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String header = req.getHeader("User-Agent");
        System.out.println(header);

        Enumeration<String> headerNames = req.getHeaderNames();

        while(headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        doGet(req,resp);
    }
}
