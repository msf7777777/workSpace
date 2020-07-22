package com.itheima.注解的案例;

import java.lang.reflect.Method;

// 请将在myTest01这个类中, 那些方法使用MyTest注解, 请调用这些方法
public class Demo02 {

    public static void main(String[] args) throws Exception {
        //1. 获取要执行方法的对应的类的字节码文件对象
        Class<MyTestDemo01> myTestDemo01Class = MyTestDemo01.class;

        //2. 创建这个类的实例对象
        MyTestDemo01 myTestDemo01 = myTestDemo01Class.newInstance();

        //3. 获取这个类中所有的成员方法

        Method[] methods = myTestDemo01Class.getMethods();

        for (Method method : methods) {

            boolean flag = method.isAnnotationPresent(MyTest.class);
            if (flag) { // 如果为true  表示当前方法存在MyTest注解

                method.invoke(myTestDemo01);
            }
        }

    }

}
