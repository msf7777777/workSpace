package cn.itcast.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 自定义切面类, 里面可以定义 多个增强的方法
 */
// 将增强类 交给spring管理
// <bean id="myAspectj" class="cn.itcast.a.MyAspectj"/>
@Component("myAspectj")
// @Aspect 确定当前类是 增强类
@Aspect
public class MyAspectj {
    /**
     * 环绕增强: 在目标方法的前后都去增加一些代码
     * 目的: 给目标方法增加 事务
     */
    @Around("cn.itcast.a.MyAspectj.myPointCut()")
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

    @Pointcut("bean(*Service)")
    private void myPointCut(){}

    /**
     * 前置增强方法(前置通知): 功能会在目标方法前面执行
     * <aop:aspect ref="myAspectj">
     *             <!--3.1 确定目标类是谁-->
     *             <aop:pointcut id="myPointcut" expression="bean(*Service)"/>
     *             <!--3.2 建立增强方法和目标类的关系-->
     *             <!--3.2.2 前置增强-->
     *             <aop:before method="beforeAdvice" pointcut-ref="myPointcut"/>
     *         </aop:aspect>
     */
//    @Before("cn.itcast.a.MyAspectj.myPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 1 开启事务
        System.out.println("======= 前置通知 1 开启事务");
    }

    /**
     * 后置增强: 功能在目标方法之后执行
     */
//    @AfterReturning(value = "cn.itcast.a.MyAspectj.myPointCut()", returning = "retrunResult")
    public void afterReturnAdvice(JoinPoint joinPoint, Object retrunResult) {
        // 3.1 如果一切正常, 提交事务(生效)
        System.out.println("========= 后置增强 3.1 如果一切正常, 提交事务(生效)");
    }

    /**
     * 抛出异常增强: 功能就出现异常后执行
     */
//    @AfterThrowing(value = "cn.itcast.a.MyAspectj.myPointCut()", throwing = "ex")
    public void afterThrowAdvice(JoinPoint joinPoint, Throwable ex) {
        // 3.2 如果出现问题, 回滚事务(撤销)
        System.out.println("========= 抛出异常增强 3.2 如果出现问题, 回滚事务(撤销)... 异常原因:" + ex.getMessage());
    }

    /**
     * 最终通知: 功能 不管是否出现异常, 都会执行
     */
//    @After("cn.itcast.a.MyAspectj.myPointCut()")
    public void afterAdvice(JoinPoint joinpoint) {
        System.out.println("========= 最终增强 4 释放资源");
    }

}
