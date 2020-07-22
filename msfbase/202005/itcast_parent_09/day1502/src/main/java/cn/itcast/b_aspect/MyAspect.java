package cn.itcast.b_aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("bean(*Service)")
    public void myPointCut() {
    }

    // 前置通知
    @Before("myPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("================== 前置通知 1.开启事务 ... ...");
    }

    // 后置通知
    @AfterReturning(value="myPointCut()", returning = "returnObject")
    public void afterReturn(JoinPoint joinPoint, Object returnObject) {
        System.out.println("================== 后置通知 3.1 一切成功提交 提交事务 ... ...");
    }

    // 后置抛出异常
    @AfterThrowing(value="myPointCut()", throwing="ex")
    public void afterThrow(JoinPoint joinPoint, Throwable ex) {
        System.out.println("==================后置抛出异常 3.2 出现问题 回滚事务 ... ... 异常信息:" + ex.getMessage());
    }

    // 最终通知
//    @After(value = "myPointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("================== 最终通知 4 释放资源 ... ...");
    }

}
