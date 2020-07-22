package cn.itcast;

import cn.itcast.uitls.C3P0Utils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3P0Test {
    @Test
    public void demo01() throws Exception {
        // 目标: 查询用户表的所有数据
        String url = "jdbc:mysql://localhost:3306/db_day0301";
        String username = "root";
        String password = "root";

        // 1 注册驱动, 选择的是哪个数据库
        Class.forName("com.mysql.jdbc.Driver");
        // DriverManager.registerDriver(new Driver());

        // 2 建立连接
        Connection conn = DriverManager.getConnection(url, username, password);
        // 3 获取执行sql的对象
        String sql = "select * from tb_user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // 4 执行sql 获取结果
        ResultSet rs = stmt.executeQuery();
        // 5 处理结果
        while (rs.next()) {
            int uid = rs.getInt("uid");
            String uname = rs.getString("username");
            String upwd = rs.getString("password");
            String nickname = rs.getString("nickname");

            System.out.println(uid + " ==== " + uname + " ==== " + upwd + " ==== " + nickname);
        }
        // 6 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }


    @Test
    public void demo02() throws Exception {
        // 目标: 查询用户表的所有数据

        // 2 从连接池中获取连接
        // 2.1 创建连接池对象
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.jdbc.Driver"); //loads the jdbc driver
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/db_day0301" );
        cpds.setUser("root");
        cpds.setPassword("root");

        // 2.2 从连接池中获取连接
        Connection conn = cpds.getConnection();

        // 3 获取执行sql的对象
        String sql = "select * from tb_user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // 4 执行sql 获取结果
        ResultSet rs = stmt.executeQuery();
        // 5 处理结果
        while (rs.next()) {
            int uid = rs.getInt("uid");
            String uname = rs.getString("username");
            String upwd = rs.getString("password");
            String nickname = rs.getString("nickname");

            System.out.println(uid + " ==== " + uname + " ==== " + upwd + " ==== " + nickname);
        }
        // 6 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }

    @Test
    public void demo03() throws Exception {
        // 目标: 查询用户表的所有数据
        // 2 从连接池中获取连接
        // 2.1 创建连接池对象
        ComboPooledDataSource cpds = new ComboPooledDataSource();

        // 2.2 从连接池中获取连接
        Connection conn = cpds.getConnection();

        // 3 获取执行sql的对象
        String sql = "select * from tb_user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // 4 执行sql 获取结果
        ResultSet rs = stmt.executeQuery();
        // 5 处理结果
        while (rs.next()) {
            int uid = rs.getInt("uid");
            String uname = rs.getString("username");
            String upwd = rs.getString("password");
            String nickname = rs.getString("nickname");

            System.out.println(uid + " ==== " + uname + " ==== " + upwd + " ==== " + nickname);
        }
        // 6 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }

    @Test
    public void demo04() throws Exception {
        // 目标: 查询用户表的所有数据
        // 2 从工具类中获取连接
        Connection conn = C3P0Utils.getConnection();

        // 3 获取执行sql的对象
        String sql = "select * from tb_user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // 4 执行sql 获取结果
        ResultSet rs = stmt.executeQuery();
        // 5 处理结果
        while (rs.next()) {
            int uid = rs.getInt("uid");
            String uname = rs.getString("username");
            String upwd = rs.getString("password");
            String nickname = rs.getString("nickname");

            System.out.println(uid + " ==== " + uname + " ==== " + upwd + " ==== " + nickname);
        }
        // 6 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
