package cn.itcast.service;

import cn.itcast.proxy.JdkFactoryProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ProductServiceTest {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    @Test
    public void demo04() throws Exception {
        productService.add();
        productService.del();
        productService.edit();
        productService.query();
    }

    @Test
    public void demo01() throws Exception {
        // 1 创建业务类对象
        ProductService productService = new ProductServiceImpl();
        // 2 调用方法
        productService.add();
        productService.del();
        productService.edit();
        productService.query();
    }

    @Test
    public void demo02() throws Exception {
        // 1 创建业务类对象
        ProductService productService = new ProductServiceImpl();
        // 2 使用代理增强
        JdkFactoryProxy jdkFactoryProxy = new JdkFactoryProxy(productService);
        ProductService proxy = (ProductService) jdkFactoryProxy.getProxyObject();
        // 3 调用方法
        proxy.add();
        proxy.del();
        proxy.edit();
        proxy.query();
    }

    @Test
    public void demo03() throws Exception {
        // 1 spring工厂
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 从工厂中获取类
        CustomerService customerService = ac.getBean("customerService", CustomerService.class);
        // 3 调用方法
        customerService.add();
        customerService.del();
        customerService.edit();
        customerService.query();
    }
}