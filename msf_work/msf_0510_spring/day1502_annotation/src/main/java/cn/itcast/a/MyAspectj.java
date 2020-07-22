package cn.itcast.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 自定义切面类, 里面可以定义 多个增强的方法
 */
//将增强类 交给 spring 管理
//<bean id="myAspectj" class="cn.itcast.a.MyAspectj"/>
@Component("myAspectj")
//@Aspect 确定当前类是 增强类
@Aspect
public class MyAspectj {

    /**
     * 环绕增强: 在目标方法的前后都去增加一些代码
     * 目的: 给目标方法增加 事务
     */
    //【环绕增强】
    @Around("bean(*Service)")
//    @Around("cn.itcast.a.MyAspectj.mypointcut()")
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

    // 切入点定义
    @Pointcut("bean(*Service)")
    private void mypointcut() {}

    /***
     * 前置增强方法（前置通知）：功能会在目标方法前面执行
     *       <!--3.1 确定目标是谁-->
     *       <aop:pointcut id="myPointcut" expression="bean(*Service)"/>
     *       <!--3.2 建立增强方法和目标类的关系-->
     *       <!--3.2.2【前置增强】-->
     *       <aop:before method="beforeAdvice" pointcut-ref="myPointcut"/>
     */
    //【前置增强】【前置通知】
//    @Before("bean(*Service)")
    @Before("cn.itcast.a.MyAspectj.mypointcut()")//上面代码也行
    public void beforeAdvice(JoinPoint joinPoint) {
        // 1 开启事务
        System.out.println("【fucking-前置通知】 1 开启事务");
    }

    /**
     * 后置增强：功能在目标方法之后执行
     */
    //【后置增强】
//    @AfterReturning(value = "bean(*Service)", returning = "returnResult")
//    @AfterReturning(value = "cn.itcast.a.MyAspectj.mypointcut()", returning = "returnResult")//上面代码也行
    public void afterReturnAdvic(JoinPoint joinPoint, Object returnResult) {
        // 3.1 如果一切正常, 提交事务(生效)
        System.out.println("【fucking-后置增强】 3.1 如果一切正常, 提交事务(生效)");
    }

    /**
     * 抛出异常增强：功能在出现异常后执行
     */
    //【抛出异常增强】
//    @AfterThrowing(value = "bean(*Service)", throwing = "throwable")
//    @AfterThrowing(value = "cn.itcast.a.MyAspectj.mypointcut()", throwing = "throwable")//上面代码也行
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
//    @After("bean(*Service)")
//    @After("cn.itcast.a.MyAspectj.mypointcut()")//上面代码也行
    public void after(JoinPoint joinPoint) {
        System.out.println("【fucking-最终通知】 4 释放资源");
    }
}
