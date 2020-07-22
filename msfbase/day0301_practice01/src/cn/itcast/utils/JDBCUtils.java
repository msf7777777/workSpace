package cn.itcast.utils;

import cn.itcast.a_jdbc.JDBCTest02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

    static String driverClassName;
    static String url;
    static String username;
    static String password;

    static {
        // 1 创建对象
        Properties props = new Properties();
        // 2 建立 对象和配置文件的关系
        InputStream in = JDBCTest02.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3 读取
        driverClassName = props.getProperty("driverClassName"); // com.mysql.jdbc.Driver
        url = props.getProperty("url"); // jdbc:mysql://localhost:3306/day03
        username = props.getProperty("username"); // root
        password = props.getProperty("password"); // root

        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }


    // 1 获取连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        // 1 注册驱动
        Class.forName(driverClassName);
        // 2 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        return conn;
    }

    // 2 释放资源
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if(rs!=null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        close(conn, stmt);
    }


    public static void close(Connection conn, Statement stmt) {
        try {
            if(stmt!=null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void release(Connection conn, PreparedStatement stmt, ResultSet rs) {
    }
}
