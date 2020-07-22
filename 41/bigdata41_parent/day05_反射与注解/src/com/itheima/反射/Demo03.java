package com.itheima.反射;

import org.junit.Test;

import java.lang.reflect.Field;

public class Demo03 {

    @Test
    public void test01() throws Exception{
        //1. 获取类的字节码文件对象
        Class<?> personClass = Class.forName("com.itheima.反射.Person");

        Object person = personClass.newInstance();
        //2.获取与设置其相关成员变量
        //2.1: 公共的成员变量设置和获取
        Field eatField = personClass.getField("age");
        System.out.println(eatField);
        eatField.setInt(person,30);

        int eatVal = eatField.getInt(person);

        System.out.println(eatVal);
        System.out.println("---------------------");
        //2.2: 私有的成员变量设置和获取
        Field nameField = personClass.getDeclaredField("name");
        System.out.println(nameField);

        nameField.setAccessible(true); // 擦除权限
        nameField.set(person,"wangwu");


        Object nameVal = nameField.get(person);
        System.out.println(nameVal);

    }
}
