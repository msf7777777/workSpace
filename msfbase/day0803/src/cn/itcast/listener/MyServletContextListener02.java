package cn.itcast.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@WebListener
public class MyServletContextListener02 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 需求: 当项目启动后, 加载spring的配置文件, 将配置文件内容 读取到控制台
        System.out.println("=====================MyServletContextListener02 监听到 项目启动了========================== ");
        // 1 通过事件对象 获取 被监听对象 ServletContext
        ServletContext servletContext = servletContextEvent.getServletContext();
        // 2 通过 ServletContext 对象 获取项目的初始化参数信息contextConfigLocation1对应的文件名
        String fileName = servletContext.getInitParameter("contextConfigLocation1");

        // 3 使用类加载器获取文件的输入流
        InputStream in = MyServletContextListener02.class.getClassLoader().getResourceAsStream(fileName);

        // 4 使用io流读取它里面的内容
        try(BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"))) {
            String line = null;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
