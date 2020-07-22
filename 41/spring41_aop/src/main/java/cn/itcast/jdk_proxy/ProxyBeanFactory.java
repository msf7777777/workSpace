package cn.itcast.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanFactory {

    // 声明处要代理的对象
    UserService userService;

    // 构造方法
    public ProxyBeanFactory(UserService userService) {
        this.userService = userService;
    }

    public Object getProxyBean() {
        Object obj = Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("【before】【before】【before】");
                        System.out.println(method);
                        Object obj = method.invoke(userService);
                        System.out.println("【after】【after】【after】" + obj);
                        return obj;
                    }
                }
        );
        System.out.println(obj);
        return obj;
    }
}
