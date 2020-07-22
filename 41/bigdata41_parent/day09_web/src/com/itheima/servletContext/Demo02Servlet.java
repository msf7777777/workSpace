package com.itheima.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo02Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
            InputStream getResourceAsStream(String path)  ;  根据要读取的文件名称, 返回其输入流
            String getRealPath(String path)  ;  根据要读取的文件名称, 返回其绝对的路径

         */
        //1. 获取servletContext对象
        ServletContext servletContext = this.getServletContext();

        //2.  读取数据
        InputStream in1 = servletContext.getResourceAsStream("WEB-INF/classes/aa.properties"); // null
        InputStream in2 = servletContext.getResourceAsStream("bb.properties"); // java.io.ByteArrayInputStream@56bfa202
        InputStream in3 = servletContext.getResourceAsStream("WEB-INF/cc.properties"); //  null

        String realPath1 = servletContext.getRealPath("WEB-INF/classes/aa.properties");
        String realPath2 = servletContext.getRealPath("bb.properties");
        String realPath3 = servletContext.getRealPath("WEB-INF/cc.properties");

        System.out.println(realPath1 +"----"+ in1);
        System.out.println(realPath2 +"----"+ in2);
        System.out.println(realPath3 +"----"+ in3);
        // 通过这个演示, 发现 这个servletContext在获取文件数据的时候, 其相对的路径是 web 根路径(项目根路径)


        System.out.println("----------------------------");
        Object cid = servletContext.getAttribute("cid");
        Object cname = servletContext.getAttribute("cname");
        System.out.println("Demo02:"+cid+"---"+cname);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
