package com.itheima.反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo02 {
    // 演示 通过反射的方式, 获取类中公共 或者 私有的方法, 并调用这些方法
    @Test
    public void test01() throws Exception{
        //1. 获取类的字节码文件对象
        Class<?> personClass = Class.forName("com.itheima.反射.Person");

        //2. 获取person类中相关的方法:
        //2.1: 获取 无参数的公共的方法
        Method eatMethod = personClass.getMethod("eat");
        System.out.println(eatMethod);

        //2.2 如何调用这个eat的方法呢?
        /*Constructor<?> constructor = personClass.getConstructor();
        Object person = constructor.newInstance();*/
        Object person = personClass.newInstance();
        Object returnVal = eatMethod.invoke(person); // 调用eat方法,  如果方法没有返回值, 此时 returnVal 为null , 否则就是对应方法的返回值
        System.out.println(returnVal);

        System.out.println("------------------------------");
        //2.3 获取有参数的公共的方法
        Method runMethod = personClass.getMethod("run", String.class);
        System.out.println(runMethod);
        //2.4 如何调用这个有参数的方法
        Object returnValRun = runMethod.invoke(person, "张三");
        System.out.println(returnValRun);

        System.out.println("------------------------------");
        //3. 演示获取私有的方法的操作:
        Method studyMethod = personClass.getDeclaredMethod("study");
        System.out.println(studyMethod);

        // 如何调用私有的方法
        studyMethod.setAccessible(true);
        Object returnStudy = studyMethod.invoke(person);
        System.out.println(returnStudy);

        System.out.println("------------------------------");
        //4. 获取所有的方法
        // 4.1: 获取所有的公共的方法, 包括其父类的
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("------------------------------");
        //4.2: 获取所有的公共和私有的方法: 不包含父类的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
