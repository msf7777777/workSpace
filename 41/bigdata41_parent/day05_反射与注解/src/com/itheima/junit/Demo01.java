package com.itheima.junit;

import org.junit.Test;

public class Demo01 {
 //  原有的调用方式
   /* public static void main(String[] args) {
        //1. 先创建当前类对象
        Demo01 demo01 = new Demo01();
        //2. 调用eat方法
        demo01.eat();

    }*/


    @Test
    public void eat(){

        System.out.println("我要吃饭了....");

    }


    public static void test01(){
        System.out.println("1111111111111");
    }

    @Test
    public void test02(){

        test01();
    }

}
