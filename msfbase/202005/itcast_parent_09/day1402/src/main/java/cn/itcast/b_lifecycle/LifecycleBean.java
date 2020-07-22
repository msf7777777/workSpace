package cn.itcast.b_lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 需求1; 将当前类交给spring管理
// @Component 代替 <bean id="xxxx" class="类的全路径"/>
// @Component 没有指定 @Component("xxxx"), 默认值是什么?  是 LifecycleBean? 还是 lifecycleBean? 正确
@Component
public class LifecycleBean {


    public LifecycleBean() {
        System.out.println("1.调用LifecycleBean的构造方法 ... ...");
    }
    // 需求2: 指定当前类生命周期方法
    // 当这个类调用构造方法以后的下一个初始化方法
    // init-method="init"
    @PostConstruct
    public void init() {
        System.out.println("2. 调用LifecycleBean的初始化方法 init ... ...");
    }

    // 当spring容器销毁时, 里面的对象也会销毁, 这个时候想调用destory
    // destroy-method="destory"
    @PreDestroy
    public void destory() {
        System.out.println("4. 调用LifecycleBean的销毁方法 destory ... ...");
    }

    public void sayHello() {
        System.out.println("3. 调用LifecycleBean的业务方法 sayHello() ... ...");
    }
}
