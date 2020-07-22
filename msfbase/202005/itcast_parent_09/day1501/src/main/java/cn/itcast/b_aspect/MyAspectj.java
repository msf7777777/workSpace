package cn.itcast.b_aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectj {

    public void around(ProceedingJoinPoint joinpoint) {
        try {
            // 1 开启事务
            System.out.println("================== 1.开启事务 ... ...");
            // 2 执行一组sql语句
            Object proceed = joinpoint.proceed();
            // 3 结束事务
            // 3.1 一切成功提交 提交事务
            System.out.println("================== 3.1 一切成功提交 提交事务 ... ...");
        } catch (Throwable e) {
            e.printStackTrace();
            // 3.2 出现问题 回滚事务
            System.out.println("================== 3.2 出现问题 回滚事务 ... ...");
        } finally {
            // 4 释放资源
            System.out.println("================== 4 释放资源 ... ...");
        }
    }

    // 前置通知
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("================== 前置通知 1.开启事务 ... ...");
    }

    // 后置通知
    public void afterReturn(JoinPoint joinPoint, Object returnObject) {
        System.out.println("================== 后置通知 3.1 一切成功提交 提交事务 ... ...");
    }

    // 后置抛出异常
    public void afterThrow(JoinPoint joinPoint, Throwable ex) {
        System.out.println("==================后置抛出异常 3.2 出现问题 回滚事务 ... ...");
    }

    // 最终通知
    public void after(JoinPoint joinPoint) {
        System.out.println("================== 最终通知 4 释放资源 ... ...");
    }


}
