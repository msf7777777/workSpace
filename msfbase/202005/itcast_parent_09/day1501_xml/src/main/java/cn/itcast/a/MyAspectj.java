package cn.itcast.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 自定义切面类, 里面可以定义 多个增强的方法
 */
public class MyAspectj {
    /**
     * 环绕增强: 在目标方法的前后都去增加一些代码
     * 目的: 给目标方法增加 事务
     */
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            // 1 开启事务
            System.out.println("======= 1 开启事务");
            // 2 执行一组sql语句, 调用目标类的方法
            result = joinPoint.proceed();
            // 3 结束事务
            // 3.1 如果一切正常, 提交事务(生效)
            System.out.println("========= 3.1 如果一切正常, 提交事务(生效)");
        } catch (Throwable e) {
            e.printStackTrace();
            // 3.2 如果出现问题, 回滚事务(撤销)
            System.out.println("========= 3.2 如果出现问题, 回滚事务(撤销)");
        } finally {
            // 4 释放资源
            System.out.println("========= 4 释放资源");
        }
        return result;
    }

    /**
     * 前置增强方法(前置通知): 功能会在目标方法前面执行
     */
    public void beforeAdvice(JoinPoint joinPoint) {
        // 1 开启事务
        System.out.println("======= 前置通知 1 开启事务");
    }

    /**
     * 后置增强: 功能在目标方法之后执行
     */
    public void afterReturnAdvice(JoinPoint joinPoint, Object retrunResult) {
        // 3.1 如果一切正常, 提交事务(生效)
        System.out.println("========= 后置增强 3.1 如果一切正常, 提交事务(生效)");
    }

    /**
     * 抛出异常增强: 功能就出现异常后执行
     */
    public void afterThrowAdvice(JoinPoint joinPoint, Throwable ex) {
        // 3.2 如果出现问题, 回滚事务(撤销)
        System.out.println("========= 抛出异常增强 3.2 如果出现问题, 回滚事务(撤销)... 异常原因:" + ex.getMessage());
    }

    /**
     * 最终通知: 功能 不管是否出现异常, 都会执行
     */
    public void afterAdvice(JoinPoint joinpoint) {
        System.out.println("========= 最终增强 4 释放资源");
    }

}
