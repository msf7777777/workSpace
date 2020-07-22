package com.itheima.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
    // 向user表中添加数据的操作
    @Test
    public void test01() throws Exception{
        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2. 获取连接
        Connection connection = DriverManager
                .getConnection(
                        "jdbc:mysql:///day07_web", "root", "123456");

        //3. 根据连接 创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql = "insert into user values(1,'zhangsan','abcdefg',20) ";
        int i = statement.executeUpdate(sql); // 影响多少行
        //5. 处理结果集
        System.out.println("影响了"+i+"行");
        //6. 释放资源
        statement.close();
        connection.close();

    }
}
