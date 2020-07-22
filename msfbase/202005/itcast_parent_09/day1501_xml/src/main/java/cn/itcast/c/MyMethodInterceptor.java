package cn.itcast.c;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 增强类
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // 1 调用业务代码
        long start = System.currentTimeMillis();
        Object result = methodInvocation.proceed();
        long end = System.currentTimeMillis();
        long total = end -start; // 共执行了多长时间

        // 2 执行增强的代码: 记录方法的执行时间
        System.out.println("==============================  开始");
        String className = methodInvocation.getThis().getClass().getName();
        String methodName = methodInvocation.getMethod().getName();
        System.out.println("************** " + className + "类的" + methodName + "方法执行了" + total + "毫秒!!!");
        System.out.println("==============================  结束");

        return result;
    }
}
