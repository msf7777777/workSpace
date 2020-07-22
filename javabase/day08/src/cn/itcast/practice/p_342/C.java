package cn.itcast.practice.p_342;
//定义实现类 C：
public class C implements A,B {
    //默认方法有重名method，重写一次:
    @Override
    public void method() {
        System.out.println("这是重写method");
    }
}
