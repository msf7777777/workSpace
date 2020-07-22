package cn.itcast.practice.p_342;
//定义多个接口 B：
interface B {
    public default void methodB(){
        System.out.println("这是不重写 默认 methodB");
    }
    public static void methodBB(){
        System.out.println("这是不重写 静态 methodBB");
    }
    public default void method(){}
}
