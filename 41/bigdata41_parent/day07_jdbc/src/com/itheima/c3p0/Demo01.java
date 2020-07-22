package com.itheima.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo01 {

    // 演示C3P0连接池的基本入门代码
    @Test
    public void test01() throws Exception{

        // 1: 创建连接池的核心类对象 : ComboPooledDataSource
        // 这个一旦创建, 自动到src的跟目录下寻找一个 c3p0-config.xml 的配置文件, 然后读取加载它
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // 2: 从连接池对象获取连接
        Connection connection = dataSource.getConnection();
        // 3: 根据连接创建语句执行平台
        String sql = "select * from category ";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4: 执行SQL,获取结果集
        ResultSet resultSet = statement.executeQuery();
        // 5: 处理结果集
        while(resultSet.next()){

            System.out.println(
                    resultSet.getInt("cid")+ resultSet.getString("cname"));
        }
        // 6: 释放资源
        resultSet.close();
        statement.close();
        connection.close(); // 此时这个位置不叫释放资源, 而应该叫做归还连接的操作
    }


    @Test
    public void test02() throws Exception{

        //1. 获取连接对象
        Connection connection = C3P0Utils.getConnection();
        //2. 根据连接创建语句执行平台
        String sql = "insert into category values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        //3. 执行SQL 获取结果集
        //3.1: 为 ?  赋值操作
        statement.setInt(1,4);
        statement.setString(2,"电子产品");

        //3.2: 执行SQL
        int i = statement.executeUpdate();

        //4. 处理结果集
        System.out.println("影响了:"+i+"行");
        //5. 释放资源
        C3P0Utils.closeAll(null,statement,connection);



    }
}
