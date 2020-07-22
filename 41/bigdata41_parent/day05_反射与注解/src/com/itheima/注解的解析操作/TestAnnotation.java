package com.itheima.注解的解析操作;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestAnnotation {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception{
        //1. 获取class的字节码文件对象 : BookStore
        Class<BookStore> bookStoreClass = BookStore.class;

        //2. 获取类上面的注解:
        //2.1: 先判断一下这个类上面是否有对应的注解呢?
        boolean flag = bookStoreClass.isAnnotationPresent(Book.class);
        if(flag){
            // 说明类上面是否这个注解, 如果有 尝试获取注解中内容
            Book bookAnnotation = bookStoreClass.getAnnotation(Book.class);

            // 获取注解中数据
            String[] authors = bookAnnotation.authors();
            double price = bookAnnotation.price();
            String value = bookAnnotation.value();
            System.out.println("书名为:"+value+"; 价格为:"+price +";作者为:"+ Arrays.toString(authors));
        }

        //3: 获取 方法上面的注解
        Method readMethod = bookStoreClass.getMethod("read", String.class);
        //3.1: 判断这个read方法上面是否有Book注解
        flag = readMethod.isAnnotationPresent(Book.class);
        if(flag){
            // 认为 方法上面是有这个注解的
            //3.2: 获取这个注解
            Book bookAnnotation = readMethod.getAnnotation(Book.class);

            //3.3: 取注解中数据
            String[] authors = bookAnnotation.authors();
            double price = bookAnnotation.price();
            String value = bookAnnotation.value();
            System.out.println("书名为:"+value+"; 价格为:"+price +";作者为:"+ Arrays.toString(authors));
        }

    }

}
