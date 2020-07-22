package cn.itcast.jdk_proxy;

import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testService() {
        UserService userService = new UserServiceImpl();
        userService.login();
    }

    @Test
    public void testProxyService() {
        UserService userService = new UserServiceImpl();

        ProxyBeanFactory beanFactory = new ProxyBeanFactory(userService);
        UserService proxyBean = (UserService) beanFactory.getProxyBean();
        System.out.println("*******【 " + proxyBean + " 】*******");
        proxyBean.login();
    }

}
