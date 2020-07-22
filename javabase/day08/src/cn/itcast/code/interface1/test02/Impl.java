package cn.itcast.interface1.test02;
// 接口中可以多实现的, 多个接口之间用,隔开
public class Impl implements A,B {
    @Override
    public void methodA() {
        System.out.println("methodA实现了");
    }

    @Override
    public void method() {

    }

    @Override
    public void methodB() {
        System.out.println("methodB实现了");
    }
}
