package cn.itcast.a_jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        // 需求: 根据id 查询用户信息 且 打印
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatis_db";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // 1 注册驱动
            Class.forName(driverClassName);
            // 2 获取连接
            conn = DriverManager.getConnection(url, username, password);
            // 3 获取执行sql的对象
            String sql = "select * from tb_user where user_name=? and password=?";
            stmt = conn.prepareStatement(sql);
            // 3.1 因为有?, 所以就需要设置值
            stmt.setString(1, "sfsfsfs");
            stmt.setString(2, "123456");

            // 4 执行sql 获取结果
            rs = stmt.executeQuery();
            // 5 处理结果
            if(rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("用户姓名: " + name + ", 年龄:" + age);
            } else {
                System.out.println("根据用户名和密码没有查到对应的用户!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6 释放资源
            try {
                if(rs!=null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

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
    }
}
