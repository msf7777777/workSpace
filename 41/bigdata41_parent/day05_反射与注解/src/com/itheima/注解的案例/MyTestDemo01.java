package com.itheima.注解的案例;
// 这个类用于使用自定义的注解
public class MyTestDemo01 {

    @MyTest
    public void test01(){
        System.out.println("调用test01方法成功了.......");
    }
    @MyTest
    public void test02(){
        System.out.println("调用test02方法成功了.......");
    }
    @MyTest
    public void test03(){
        System.out.println("调用test03方法成功了.......");
    }
}
