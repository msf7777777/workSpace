package cn.itcast.b;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class CglibProxyFactory {
    // 目标类
    public Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        // 1 创建增强类对象
        Enhancer enhancer = new Enhancer();
        // 2 建立目标类和增强类的关系
        enhancer.setSuperclass(target.getClass());
        // 3 书写增强的代码, 怎么增强
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("==================================== 开始");

                // 2 调用增强代码
                // 2.1 获取目标类的名
                String className = target.getClass().getName();
                // 2.2 获取方法名
                String methodName = method.getName();
                // 2.3 增强方法
                System.out.println(new Date().toLocaleString() + " : 使用cglib动态代理 记录日志: " + className + "类的" + methodName + "方法执行了 ... ...");
                // 1 调用业务代码
                Object result = methodProxy.invokeSuper(proxy, args);
                System.out.println("==================================== 结束");
                return result;
            }
        });
        // 4 创建且返回
        return enhancer.create();
    }
}
