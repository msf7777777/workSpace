package cn.itcast.b_lifecycle;

public class LifecycleBean {
    public LifecycleBean() {
        System.out.println("1. 调用 LifecycleBean 的 构造方法 【LifecycleBean()】");
    }

    //当这个类调用构造方法以后的下一个初始化方法
    public void init() {
        System.out.println("2. 调用 LifecycleBean 的 初始化方法 【init()】");
    }

    //
    public void sayHello() {
        System.out.println("3. 调用 LifecycleBean 的 业务方法 【sayHello()】");
    }

    //当spring容器销毁时，里面的对象也会销毁，这个时候想调用destory方法
    public void destory() {
        System.out.println("4. 调用 LifecycleBean 的 销毁方法 【destory()】");
    }
}
