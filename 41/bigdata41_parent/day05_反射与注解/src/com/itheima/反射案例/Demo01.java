package com.itheima.反射案例;

import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
    @SuppressWarnings("all")
    @Test
    public void test01() throws Exception{

        //1.读取这个配置文件:
        Properties properties = new Properties(); // 主要是用来读取 后缀为properties的配置文件, 其底层为 io流 + map集合

        //1.1: 读取文件
        ClassLoader classLoader = Demo01.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("config.properties");
        properties.load(inputStream);

        //1.2: 获取数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        System.out.println(className+"---"+methodName);

        //2. 根据包名与类型 获取其字节码文件对象, 然后创建其对象
        //2.1: 获取字节码文件对象
        Class<?> aClass = Class.forName(className);

        //2.2: 根据字节码对象 创建实例对象
        Object obj = aClass.newInstance();
        System.out.println(obj);
        //3. 根据方法名称, 获取方法的对象
        Method method = aClass.getMethod(methodName);
        System.out.println(method);

        //4. 调用方法
        Object returnVal = method.invoke(obj);
        System.out.println(returnVal);




    }

    @SuppressWarnings("all")// 解除警告
    @Test
    public void test02() throws Exception{

        //1.读取这个配置文件:
        Properties properties = new Properties(); // 主要是用来读取 后缀为properties的配置文件, 其底层为 io流 + map集合

        //1.1: 读取文件
        ClassLoader classLoader = Demo01.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("config.properties");
        properties.load(inputStream);

        //1.2: 获取数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        System.out.println(className+"---"+methodName);

        //2. 根据包名与类型 获取其字节码文件对象, 然后创建其对象
        //2.1: 获取字节码文件对象
        Class<?> aClass = Class.forName(className);

        //2.2: 根据字节码对象 创建实例对象
        Object obj = aClass.newInstance();
        System.out.println(obj);
        //3. 根据方法名称, 获取方法的对象
        Method method = aClass.getMethod(methodName);
        System.out.println(method);

        //4. 调用方法
        Object returnVal = method.invoke(obj);
        System.out.println(returnVal);




    }
}
