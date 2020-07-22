package com.itheima.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01 {

    // jdbc的入门案例
    @Test
    public void test01() throws Exception{
        // 1) 注册驱动
        //DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.jdbc.Driver");
        // 2) (使用驱动管理类)获取连接
        // url格式:  :jdbcmysql://ip地址:端口号/数据库名称
        Connection connection = DriverManager
                .getConnection(
                        "jdbc:mysql://localhost:3306/day07_web", "root", "123456");
        // 3) 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        // 4) 执行SQL语句, 获取结果集

        String sql = "select *  from category ";
        ResultSet resultSet = statement.executeQuery(sql);
        // 5) 处理结果集
        while(resultSet.next()){

            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");

            System.out.println("cid:"+cid +";cname:"+cname);
        }
        // 6) 释放资源
        resultSet.close();
        statement.close();
        connection.close();

    }

}
