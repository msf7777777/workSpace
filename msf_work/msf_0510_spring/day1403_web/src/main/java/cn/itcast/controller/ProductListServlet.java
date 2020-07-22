package cn.itcast.controller;

import cn.itcast.service.ProductService;
import cn.itcast.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet("/ProductListServlet")
public class ProductListServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        response.getWriter().print("【fucking】 ProductListServlet 中显示所有的商品.... ...");
        //调用业务层 进行业务操作
        //传统方式
        //ProductService productService = new ProductServiceImpl();
        //productService.queryAll();//后台显示

        //通过spring容器的方式获取
        //缺点：每次都会 new
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ProductService productService = ac.getBean("productService", ProductService.class);
//        productService.queryAll();

        //解决：获取 spring 容器的应用，spring容器在服务器启动后已经 new 出来了
        //方案一：
//        ApplicationContext ac = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        //方案二：
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        ProductService productService = ac.getBean("productService", ProductService.class);
        productService.queryAll();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}