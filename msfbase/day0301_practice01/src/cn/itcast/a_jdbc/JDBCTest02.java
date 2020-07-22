package cn.itcast.a_jdbc;

import cn.itcast.utils.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest02 {

    // 需求: 根据用户名和密码查询用户数据
    @Test
    public void demo01() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // 2 获取连接
        conn = JDBCUtils.getConnection();
        // 3 获取执行sql的对象
        String sql = "select * from msf where username=? and password=?";
        stmt = conn.prepareStatement(sql);
        // 3.1 如果有? , 就需要输入值
        stmt.setString(1, "zjb");
        stmt.setString(2, "19961223");
        // 4 执行sql 获取结果
        rs = stmt.executeQuery();
        // 5 处理结果
        if(rs.next()) {
            int uid = rs.getInt("uid");
            String uname = rs.getString("username");
            System.out.println("【demo01】");
            System.out.println("ID: " + uid + " 名字: " + uname);
            System.out.println("恭喜你,登录成功");
        } else {
            System.out.println("【demo01】");
            System.out.println("用户名或密码错误!");
        }
        // 6 释放资源
        JDBCUtils.close(conn, stmt, rs);
    }

    // 需求2: 插入一条sql语句
    @Test
    public void demo02() throws Exception {
        // insert into tb_user(uid, username, password, nickname) values(null, ?, ?, ?);
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;

        // 2 获取连接
        conn = JDBCUtils.getConnection();
        // 3 获取执行sql的对象
        String sql = "insert into msf(uid, username, password, nickname) values(null, ?, ?, ?);";
        stmt = conn.prepareStatement(sql);
        // 3.1 设置参数
        stmt.setString(1, "hzj");
        stmt.setString(2, "20000225");
        stmt.setString(3, "韩卓君");
        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();
        // 5 处理结果
        System.out.println("【demo02】");
        System.out.println("影响条数: " + count);
        // 6 释放资源
        JDBCUtils.close(conn, stmt);
    }

    // 需求3: 修改
    @Test
    public void demo03() throws Exception {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;

        // 1 注册驱动
        Class.forName(driverClassName);
        // 2 获取连接
        conn = DriverManager.getConnection(url, username, password);
        // 3 获取执行sql的对象
        String sql = "update msf set username=?, nickname=? where uid = ?";
        stmt = conn.prepareStatement(sql);
        //   设置参数
        stmt.setString(1, "zjb");
        stmt.setString(2, "周庆长");
        stmt.setInt(3, 4);
        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();
        // 5 处理结果
        System.out.println("【demo03】");
        System.out.println("修改影响条数: " + count);
        // 6 释放资源
        stmt.close();
        conn.close();
    }

    // 需求4: 删除
    @Test
    public void demo04() throws Exception {
        // delete from tb_user where uid=?
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;

        // 1 注册驱动
        Class.forName(driverClassName);
        // 2 获取连接
        conn = DriverManager.getConnection(url, username, password);
        // 3 获取执行sql的对象
        String sql = "delete from msf where uid=?";
        stmt = conn.prepareStatement(sql);
        // 3.1 设置参数
        stmt.setInt(1, 7);
        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();
        // 5 处理结果
        System.out.println("【demo04】");
        System.out.println("删除 影响的条数:" + count);
        // 6 释放资源
        stmt.close();
        conn.close();
    }

    // 回顾 Properties对象 作用: 读取外部的 xxxx.properties文件内容
    @Test
    public void demo05() throws Exception {
        // 注意事项: 文件 必须 放到src目录下
        // 1 创建对象
        Properties props = new Properties();
        // 2 建立 对象和配置文件的关系
        InputStream in = JDBCTest02.class.getClassLoader().getResourceAsStream("jdbc.properties");
        props.load(in);
        // 3 读取
        String driverClassName = props.getProperty("driverClassName");
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println("【demo05】");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }


}
