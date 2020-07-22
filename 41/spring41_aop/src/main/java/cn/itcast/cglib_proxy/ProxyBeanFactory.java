package cn.itcast.cglib_proxy;

import cn.itcast.jdk_proxy.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.xml.ws.Service;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanFactory {

    // 1 声明要代理的对象
    PersonService service = new PersonService();

    // 2
    public ProxyBeanFactory() {
        this.service = service;
    }

    // 3
    public Object getProxy() {
        // cglib进行动态代理的核心类
        Enhancer enhancer = new Enhancer();
        // 设置要代理的类
        enhancer.setSuperclass(service.getClass());
        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            /**
             *
             * @param o
             * @param method
             * @param objects
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                return null;
            }
        });
    }
}
