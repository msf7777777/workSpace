package com.itheima.properties;

import java.util.Properties;
import java.util.Set;

public class Demo01 {
    // properties的基本数据操作
    public static void main(String[] args) {

        //1. 创建properties的对象
        Properties properties = new Properties();

        //2. 向这个对象添加数据
        properties.setProperty("username","张三");
        properties.setProperty("age","30");
        properties.setProperty("address","北京");
        properties.setProperty("iphone","138888888");

        //3. 获取数据
        String username = properties.getProperty("username");
        String age = properties.getProperty("age");
        System.out.println("username"+username +";age:"+age);
        // set集合特点:  唯一  无序
        Set<String> keys = properties.stringPropertyNames();

        for (String key : keys) {
            System.out.println(key);
        }

    }
}
