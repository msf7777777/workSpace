package cn.itcast;

import cn.itcast.utils.DruidUtils;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidTest {

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
        // 2.1 创建连接池
        Properties props = new Properties();
        InputStream in = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        props.load(in);
        DataSource ds = DruidDataSourceFactory.createDataSource(props);
        // 2.2 从连接池中获取连接
        Connection conn = ds.getConnection();
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
        // 2 从连接池工具类中获取连接
        Connection conn = DruidUtils.getConnection();
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
