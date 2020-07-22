package cn.itcast.d_lifecycle;

public class LifecycleBean {
    public LifecycleBean() {
        System.out.println("1.调用LifecycleBean的构造方法 ... ...");
    }

    // 当这个类调用构造方法以后的下一个初始化方法
    public void init() {
        System.out.println("2. 调用LifecycleBean的初始化方法 init ... ...");
    }

    // 当spring容器销毁时, 里面的对象也会销毁, 这个时候想调用destory
    public void destory() {
        System.out.println("4. 调用LifecycleBean的销毁方法 destory ... ...");
    }

    public void sayHello() {
        System.out.println("3. 调用LifecycleBean的业务方法 sayHello() ... ...");
    }
}
