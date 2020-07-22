package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkFactoryProxy {

    private Object target;

    public JdkFactoryProxy(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String simpleName = target.getClass().getName();
                        String methodName = method.getName();
                        System.out.println("======= 记录日志: 类名=" + simpleName + ", 方法名=" + methodName);
                        return method.invoke(target, args);
                    }
                }
        );
    }
}
