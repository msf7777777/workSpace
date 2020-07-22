package cn.itcast.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspectj")
@Aspect
public class MyAspectj {

    // 切入点定义
    @Pointcut("bean(*Service)")
    private void mypointcut() {}

    //【环绕增强-所有都增强】
//    @Around("cn.itcast.a.MyAspectj.mypointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            //1 开启事务
            System.out.println("【环绕】【前置增强】-1 开启事务");
            //  执行一组sql语句, 调用目标类的方法
            result = joinPoint.proceed();
            //2 结束事务
            //  如果正常，提交事务(生效)
            System.out.println("【环绕】【后置增强】-2 如果正常，提交事务(生效)");
        } catch (Throwable e) {
            e.printStackTrace();
            //3 回滚事务
            //  如果异常，回滚事务(撤销)
            System.out.println("【环绕】【抛出异常增强】-3 如果异常，回滚事务(撤销)");
        } finally {
            //4 释放资源
            System.out.println("【环绕】【最后通知】-4 释放资源");
        }
        return result;
    }

    //【前置增强】
    @Before("cn.itcast.a.MyAspectj.mypointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        //1 开启事务
        System.out.println("【独】【前置增强】-1 开启事务");
    }

    //【后置增强】
    @AfterReturning(value = "cn.itcast.a.MyAspectj.mypointcut()", returning = "returnResult")
    public void afterReturnAdvic(JoinPoint joinPoint, Object returnResult) {
        //2 结束事务
        //  如果正常，提交事务(生效)
        System.out.println("【独】【后置增强】-2 如果正常，提交事务(生效)");
    }

    //【抛出异常增强】
    @AfterThrowing(value = "cn.itcast.a.MyAspectj.mypointcut()", throwing = "throwable")
    public void afterThrowAdvice(JoinPoint joinPoint, Throwable throwable) {
        //3 回滚事务
        //  如果异常，回滚事务(撤销)
        System.out.print("【独】【抛出异常增强】-3 如果异常，回滚事务(撤销)");
        System.out.println(" 异常原因：" + throwable.getMessage());
    }

    //【最后通知】
    @After("cn.itcast.a.MyAspectj.mypointcut()")
    public void after(JoinPoint joinPoint) {
        //4 释放资源
        System.out.println("【独】【最后通知】-4 释放资源");
    }
}
