package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

public class ReqServlet03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
            String getParameter(String name)  ; 根据key  获取value
			Enumeration getParameterNames()  ;  获取所有的key
			Map getParameterMap()  ;   获取所有的请求参数, 按照kv对 封装到map的集合中
            String[]  getParameterValues(String name) ; 根据key  获取value(多个)
         */
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String city = req.getParameter("city");
        String info = req.getParameter("info");

        String[] hobbies = req.getParameterValues("hobby");

        System.out.println(username);
        System.out.println(password);
        System.out.println(sex);
        System.out.println(city);
        System.out.println(info);
        System.out.println(Arrays.toString(hobbies));

        System.out.println("----------------------------");

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String key = parameterNames.nextElement();
            System.out.println(key);
        }

        System.out.println("----------------------------");

        Map<String, String[]> parameterMap = req.getParameterMap();

        for (String key : parameterMap.keySet()) {

            String[] val = parameterMap.get(key);

            System.out.println(key+"--"+Arrays.toString(val));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
