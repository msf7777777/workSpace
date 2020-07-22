package cn.itcast.proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        // 1 创建增强类
        Enhancer enhancer = new Enhancer();
        // 2 确定对哪个类进行增强
        enhancer.setSuperclass(target.getClass());
        // 3 书写增强代码
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                String classname = target.getClass().getName();
                String methodName = method.getName();
                System.out.println("记录日志: " + classname + "类的" + methodName+ "方法执行了 ... ...");
                return methodProxy.invokeSuper(proxy, args);
            }
        });
        // 4 返回结果
        return enhancer.create();
    }
}
