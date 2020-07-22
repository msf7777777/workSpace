package cn.itcast.juint;

import org.junit.Test;

public class Demo01 {

    @Test
    public void eat() {

        System.out.println("【Demo01】_我要吃饭了");
    }

    public static void staticTest() {

        System.out.println("【staticTest】_我是静态方法（无返回）");

    }

    @Test
    public void staticTestTest() {

        staticTest();
    }

}
