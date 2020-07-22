package cn.itcast.b_lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//需求1：将当前类交给spring管理
//@Component 代替 <bean id="lifecycleBean" class="cn.itcast.b_lifecycle.LifecycleBean"/>
//@Component 没有指定 @Component()，默认值是什么？是 LifecycleBean ？还是 lifecycleBean
@Component("lifecycleBean")
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("1. 调用 LifecycleBean 的 构造方法 【LifecycleBean()】");
    }

    //需求2：指定当前类的生命周期方法
    //当这个类调用构造方法以后的下一个初始化方法
    //@PostConstruct 代替 init-method="init"
    @PostConstruct
    public void init() {
        System.out.println("2. 调用 LifecycleBean 的 初始化方法 【init()】");
    }

    //
    public void sayHello() {
        System.out.println("3. 调用 LifecycleBean 的 业务方法 【sayHello()】");
    }

    //当spring容器销毁时，里面的对象也会销毁，这个时候想调用destory方法
    //@PreDestroy 代替 destroy-method="destory"
    @PreDestroy
    public void destory() {
        System.out.println("4. 调用 LifecycleBean 的 销毁方法 【destory()】");
    }
}
