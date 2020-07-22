package cn.itcast.practice.p_321;

public interface InterFaceName {
    //1.定义一个抽象方法
    public abstract void method();

    //2.定义一个默认方法
    public default void method1() {
        System.out.println("default 默认方法");
        // 执行语句
    }

    //3.定义一个静态方法
    public static void method2() {
        System.out.println("static 静态方法");
        // 执行语句
    }
    public abstract void method2(int a);
}
