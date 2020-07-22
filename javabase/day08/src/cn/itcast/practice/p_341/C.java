package cn.itcast.practice.p_341;

public class C implements A,B {
    //专属A的方法
    @Override
    public void showA() {
        System.out.println("showA");
    }

    //专属B的方法
    @Override
    public void showB() {
        System.out.println("showB");
    }

    //A & B 共有的方法
    @Override
    public void show() {
        System.out.println("show");
    }
}
