package cn.itcast.interface1.test05;

public class AImpl1 implements A {
    @Override
    public void method() {
        System.out.println("AImpl1实现接口");
    }

    @Override
    public void method1() {
        System.out.println("修改的升级方法");
    }
}
