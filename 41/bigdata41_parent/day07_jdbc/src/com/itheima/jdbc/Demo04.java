package com.itheima.jdbc;

import com.itheima.jdbcUtils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 采用预编译的方式 实现对数据库的CURD操作
public class Demo04 {

    /*
        //1. 注册驱动

        //2. 获取连接

        //3. 根据连接创建语句执行平台

        //4. 执行SQL , 获取结果集

        //5. 处理结果集

        //6 释放资源

     */
    //1. 添加数据的操作
    @Test
    public void test01() throws Exception{

        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台

        String sql = " insert  into user values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        //4. 执行SQL , 获取结果集
        //4.1: 先对 ? 进行赋值操作
        statement.setInt(1,2);
        statement.setString(2,"王五");
        statement.setString(3,"abc123");
        statement.setInt(4,20);

        //4.2: 执行SQL
        int i = statement.executeUpdate();
        //5. 处理结果集
        System.out.println("影响了:"+i+"行");
        //6 释放资源
        JDBCUtils.closeAll(null,statement,connection);


    }


    // 查询数据的操作:  根据 用户名  密码 和年龄
    @Test
    public void test02() throws Exception{

        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        String sql = "select * from user where username=? and password = ? and age =? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        //4. 执行SQL , 获取结果集
        //4.1: 先对? 进行赋值操作
        statement.setString(1,"王五");
        statement.setString(2,"abc123");
        statement.setInt(3,20);

        //4.2: 执行SQL操作
        ResultSet resultSet = statement.executeQuery();
        //5. 处理结果集

        while(resultSet.next()) {

            int id = resultSet.getInt("id");

            String username = resultSet.getString("username");
            String password = resultSet.getString("password");

            int age = resultSet.getInt("age");

            System.out.println("id:"+id+";username:"+username+";password:"+password+";age:"+age);
        }

        //6 释放资源
        JDBCUtils.closeAll(resultSet,statement,connection);

    }

}
