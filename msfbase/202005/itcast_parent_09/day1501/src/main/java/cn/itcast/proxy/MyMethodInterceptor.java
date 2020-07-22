package cn.itcast.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = methodInvocation.proceed();
        long end = System.currentTimeMillis();
        System.out.println("=============================");
        String className = methodInvocation.getThis().getClass().getSimpleName();
        String methodName = methodInvocation.getMethod().getName();
        long interval = end - start;
        System.out.println("类名: " + className);
        System.out.println("方法名: " + methodName);
        System.out.println("间隔: " + interval);
        System.out.println("=============================");
        return result;
    }
}
