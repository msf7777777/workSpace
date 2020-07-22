package com.itheima.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Demo01Sservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
            String getContextPath() ;  用来获取 当前web项目的虚拟项目名称
            String getInitParameter(String name)  ;  获取web项目中初始化的参数:  根据name获取value
            Enumeration getInitParameterNames()  ;   获取web项目中初始化的参数: 获取所有的初始化的name的名称
            String getMimeType(String file)  ; 获取某一个文件的mime类型是什么, 目的与context-type配合告知浏览器响应的数据类型

         */
        //1. 如何获取这个servletContext对象:
        ServletContext servletContext1 = this.getServletContext();

        //ServletContext servletContext2 = req.getServletContext();
        //System.out.println(servletContext1 +"---"+servletContext2);

        //2. 相关的API :
        String contextPath = servletContext1.getContextPath(); // 用来获取 当前web项目的虚拟项目名称
        System.out.println(contextPath);

        /*
            String getInitParameter(String name)  ;
            Enumeration getInitParameterNames()

            用来获取web项目的初始值的参数,
            整个web项目的初始化参数, 应该如何配置呢?  web的全局初始化参数, 需要配置在 web.xml中, 然后通过servletContext对象,
                进行 获取 并处理
                //  将以下内容 放置在web.xml中最上面
                <context-param>
                    <param-name>username</param-name>
                    <param-value>zhangsan</param-value>
                </context-param>

                <context-param>
                    <param-name>password</param-name>
                    <param-value>123456</param-value>
                </context-param>

         */
        // 在获取web.xml中初始化参数:  适用于根据name来获取value, 知道nama都有什么
        String username = servletContext1.getInitParameter("username");
        String password = servletContext1.getInitParameter("password");

        System.out.println(username+"   "+password);

        System.out.println("----------------------");
        // 在获取web.xml中初始化参数:  适用于并不清楚初始化参数哟卞, 但是需要获取
        Enumeration<String> names = servletContext1.getInitParameterNames();
        while( names.hasMoreElements()){
            String element = names.nextElement();
            System.out.println(element);
        }

        System.out.println("-------------------------------");
        // 这个  mimeType1 主要和  一个响应头配合使用:  Context-type ,  用于告知浏览器响应回来数据的文件类型
        String mimeType1 = servletContext1.getMimeType("demo.html");  // text/html
        String mimeType2 = servletContext1.getMimeType("a.txt");  // text/plain
        System.out.println(mimeType1+"--"+mimeType2);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
