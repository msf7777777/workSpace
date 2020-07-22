package cn.itcast.practice.p_342;
//定义多个接口 A：
public interface A {
    public default void methodA(){
        System.out.println("这是不重写 默认 methodA");
    }
    public static void methodAA(){
        System.out.println("这是不重写 静态 methodAA");
    }
    public default void method(){}
}
