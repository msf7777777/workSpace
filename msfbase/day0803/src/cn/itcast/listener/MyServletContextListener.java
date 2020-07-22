package cn.itcast.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 1 创建一个类, 根据需求 实现监听器接口
 * 2 重写接口中的方法
 * 3 在web.xml注册, 目的: 为了tomcat认识当前监听器
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 通过事件对象 获取 事件源对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        String realPath = servletContext.getRealPath("/WEB-INF/words.txt");

        System.out.println("================= 1 监听项目" + servletContext.getContextPath() + "启动了, 加载配置文件 ... ....");
        System.out.println("================== 获取文件的绝对路径: " + realPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("2 监听项目关闭了, ... ....");
    }
}
