package com.itheima.jdbc;

import com.itheima.jdbcUtils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 演示 user 表  基于 JDBCUtils工具类 实现 CURD操作
public class Demo03 {
    /*
        //1. 注册驱动

        //2. 获取连接

        //3. 根据连接创建语句执行平台

        //4. 执行SQL 获取结果集

        //5. 处理结果集

        //6. 释放资源


     */
    // 添加数据的操作
    @Test
    public void test01() throws Exception {
        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql = "insert into user values(2,'lisi','123123',30) ";
        int i = statement.executeUpdate(sql);
        //5. 处理结果集
        System.out.println("影响了" + i + "行");
        //6. 释放资源
        JDBCUtils.closeAll(null, statement, connection);

    }


    // 修改数据的操作
    @Test
    public void test02() throws Exception {

        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();

        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集

        String sql = "update user set age=25 where id = 2";
        int i = statement.executeUpdate(sql);

        //5. 处理结果集
        System.out.println("影响了" + i + "行");
        //6. 释放资源
        JDBCUtils.closeAll(null, statement, connection);
    }

    // 删除数据操作
    @Test
    public void test03() throws Exception {
        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql = "delete from user where id =2";
        int i = statement.executeUpdate(sql);
        //5. 处理结果集
        System.out.println("影响了:" + i + "行");
        //6. 释放资源
        JDBCUtils.closeAll(null, statement, connection);

    }

    // 查询: 查询全部数据
    @Test
    public void  test04() throws Exception{

        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql = "select * from user ";  // 查询的结果是多条数据
        ResultSet resultSet = statement.executeQuery(sql);
        //5. 处理结果集
        while (resultSet.next()){

            int id = resultSet.getInt("id");

            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            int age = resultSet.getInt("age");

            System.out.println(
                    "id:"+id+";username:"+username+";password:"+password+";age"+age);
        }

        //6. 释放资源
        JDBCUtils.closeAll(resultSet,statement,connection);

    }

    // 查询:  查询id 为1的数据
    @Test
    public void  test05() throws Exception{

        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql = "select * from user where id = 1 ";
        ResultSet resultSet = statement.executeQuery(sql);
        //5. 处理结果集 : 由于 这个result最多只能有一条数据, 所以不需要进行遍历
        if(resultSet.next()){
            // 如果为true, 说指向到这一行了, 如果为false, 说明没有数据
            int id = resultSet.getInt("id");

            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            int age = resultSet.getInt("age");

            System.out.println(
                    "id:"+id+";username:"+username+";password:"+password+";age"+age);
        }
        //6. 释放资源
        JDBCUtils.closeAll(resultSet,statement,connection);
    }



    // 演示 SQL注入的问题: 模拟一个登陆操作
    @Test
    public void test06() throws Exception{


        login("zhangsan","123123123 ' or 1 ='1");

    }

    // 这是一个登陆的方法, 根据用户名和密码到数据库查询,
    //      如果能查询到, 说明登陆成功了, 如果查询不到 说明登陆失败;了
    public  void login (String username , String password) throws Exception {
        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        Statement statement = connection.createStatement();
        //4. 执行SQL 获取结果集
        String sql  = "SELECT  * FROM USER WHERE username ='"+username+"' AND  PASSWORD = '"+password+"' ";
        ResultSet resultSet = statement.executeQuery(sql);
        //5. 处理结果集
        boolean flag = resultSet.next();
        if(flag){
            // 说明登陆成功了, 因为 next的调用为true , 说明结果集中有数据
            System.out.println("恭喜你, 哥们, 登陆成功了....");
        }else{
            System.out.println("不好意思, 您的用户名或密码有误!!!");
        }
        //6. 释放资源
        JDBCUtils.closeAll(resultSet,statement,connection);
    }


    // ----------------解决SQL注入的问题-------------------------


    @Test
    public void test07() throws Exception{


        login2("zhangsan","abcdefg");

    }

    public  void login2 (String username , String password) throws Exception {
        //1. 注册驱动
        //2. 获取连接
        Connection connection = JDBCUtils.getConnection();
        //3. 根据连接创建语句执行平台
        //Statement statement = connection.createStatement();  非预编译的操作
        String sql  = "SELECT  * FROM USER WHERE username = ? AND  PASSWORD = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);// 会对SQL进行预编译的操作
        //4. 执行SQL 获取结果集
        //4.1: 需要在执行前 给 ? 传递参数
        statement.setString(1,username);
        statement.setString(2,password);

        //4.2: 执行SQL
        ResultSet resultSet = statement.executeQuery();
        //5. 处理结果集
        boolean flag = resultSet.next();
        if(flag){
            // 说明登陆成功了, 因为 next的调用为true , 说明结果集中有数据
            System.out.println("恭喜你, 哥们, 登陆成功了....");
        }else{
            System.out.println("不好意思, 您的用户名或密码有误!!!");
        }
        //6. 释放资源
        JDBCUtils.closeAll(resultSet,statement,connection);
    }
}