package com.itheima.properties;

import java.io.FileReader;
import java.util.Properties;

public class Demo02 {

    // 跟流相关的操作
    public static void main(String[] args) throws Exception {

        //1. 创建properties对象
        Properties properties = new Properties();

        //2. 读取数据: 模块下的数据

        properties.load(new FileReader("day06_properties/config.properties"));

        //3. 获取数据
        String cid = properties.getProperty("cid");
        String cname = properties.getProperty("cname");

        System.out.println(cid +"  "+ cname);

        //4. 读取 src下配置文件
        //properties.load(new FileReader("day06_properties/src/conf.properties"));
        properties.load(Demo02.class.getClassLoader().getResourceAsStream("conf.properties"));
        //5. 获取数据
        String pid = properties.getProperty("pid");
        String pname = properties.getProperty("pname");

        System.out.println(pid +"  "+ pname);
    }
}
