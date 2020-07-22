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
    //【环绕增强】
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            // 1 开启事务
            System.out.println("【fucking-前置通知】 1 开启事务");
            // 2 执行一组sql语句, 调用目标类的方法
            result = joinPoint.proceed();
            // 3 结束事务
            // 3.1 如果一切正常, 提交事务(生效)
            System.out.println("【fucking-后置增强】 3.1 如果一切正常, 提交事务(生效)");
        } catch (Throwable e) {
            e.printStackTrace();
            // 3.2 如果出现问题, 回滚事务(撤销)
            System.out.println("【fucking-抛出异常增强】 3.2 如果出现问题, 回滚事务(撤销)");
        } finally {
            // 4 释放资源
            System.out.println("【fucking-最终通知】 4 释放资源");

        }
        return result;
    }

    /***
     * 前置增强方法（前置通知）：功能会在目标方法前面执行
     */
    //【前置增强】【前置通知】
    public void beforeAdvice(JoinPoint joinPoint) {
        // 1 开启事务
        System.out.println("【fucking-前置通知】 1 开启事务");
    }

    /**
     * 后置增强：功能在目标方法之后执行
     */
    //【后置增强】
    public void afterReturnAdvic(JoinPoint joinPoint, Object returnResult) {
        // 3.1 如果一切正常, 提交事务(生效)
        System.out.println("【fucking-后置增强】 3.1 如果一切正常, 提交事务(生效)");
    }

    /**
     * 抛出异常增强：功能在出现异常后执行
     */
    //【抛出异常增强】
    public void afterThrowAdvice(JoinPoint joinPoint, Throwable throwable) {
        // 3.2 如果出现问题, 回滚事务(撤销)
        System.out.println("【fucking-抛出异常增强】 " +
                "3.2 如果出现问题, 回滚事务(撤销)" +
                ".... ....异常原因：" + throwable.getMessage());
    }

    /**
     * 最终增强（最终通知）：不管是否出现异常，都会执行
     */
    //【最终增强】
    public void after(JoinPoint joinPoint) {
        System.out.println("【fucking-最终通知】 4 释放资源");
    }
}
