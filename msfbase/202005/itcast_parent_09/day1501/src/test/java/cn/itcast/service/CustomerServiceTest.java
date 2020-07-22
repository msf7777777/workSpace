package cn.itcast.service;

import cn.itcast.proxy.CglibProxyFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    @Test
    public void demo01() throws Exception {
        // 1 创建对象
        CustomerService customerService = new CustomerServiceImpl();
        // 2 调用方法
        customerService.add();
        customerService.del();
        customerService.edit();
        customerService.query();
    }

    @Test
    public void demo02() throws Exception {
        // 1 创建对象
        CustomerService customerService = new CustomerServiceImpl();
        // 2 增强对象
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(customerService);
        CustomerService proxy = (CustomerService) cglibProxyFactory.getProxyObject();
        // 3 调用方法
        proxy.add();
        proxy.del();
        proxy.edit();
        proxy.query();
    }

}