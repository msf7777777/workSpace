package cn.itcast.b;

import org.junit.Test;

public class SprintTest {

    @Test
    public void demo01() {
        // 目标: 调用目标类的方法
        // 1 创建目标类对象
        ProductService productService = new ProductServiceImpl();
        // 2 调用方法: 直接调用目标类的方法
        productService.add();
        productService.del();
        productService.update();
        productService.query();
    }

    @Test
    public void demo02() {
        // 目标: 调用目标类的方法
        // 1 创建目标类对象
        ProductService productService = new ProductServiceImpl();

        // 2 获取代理类(增强类)
        // 2.1 建立目标类和代理类的关系
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory(productService);
        ProductService proxy = (ProductService) jdkProxyFactory.getProxy();

        // 3 调用方法: 调用代理类的方法, 间接调用目标类的方法了
        proxy.add();
        proxy.del();
        proxy.update();
        proxy.query();
    }

    @Test
    public void demo03() {
        // 目标: 调用目标类的方法(这里会报错)
        // jdk的使用前提条件: 目标类必须有接口
        // 1 创建目标类对象
        UserService userService = new UserService();

        // 2 获取代理类(增强类)
        // 2.1 建立目标类和代理类的关系
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory(userService);
        UserService proxy = (UserService) jdkProxyFactory.getProxy();

        // 3 调用方法: 调用代理类的方法, 间接调用目标类的方法了
        proxy.add();
        proxy.del();
        proxy.update();
        proxy.query();
    }

    @Test
    public void demo04() {
        // 目标: 使用cglib动态代理增强 增加日志
        // jdk的使用前提条件: 目标类必须有接口
        // 1 创建目标类对象(没有接口)
       UserService userService = new UserService();

        // 2 获取代理类(增强类)
        // 2.1 建立目标类和代理类的关系
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(userService);
        UserService proxy = (UserService) cglibProxyFactory.getProxy();

        // 3 调用方法: 调用代理类的方法, 间接调用目标类的方法了
        proxy.add();
        proxy.del();
        proxy.update();
        proxy.query();
    }

    @Test
    public void demo05() {
        // 目标: 使用cglib动态代理增强 增加日志
        // jdk的使用前提条件: 目标类必须有接口
        // 1 创建目标类对象(有接口)
        ProductService productService = new ProductServiceImpl();

        // 2 获取代理类(增强类)
        // 2.1 建立目标类和代理类的关系
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(productService);
        ProductService proxy = (ProductService) cglibProxyFactory.getProxy();

        // 3 调用方法: 调用代理类的方法, 间接调用目标类的方法了
        proxy.add();
        proxy.del();
        proxy.update();
        proxy.query();
    }
}
