package cn.itcast.code;

import com.mysql.jdbc.Driver;
import org.junit.Test;
import java.sql.*;

public class JDBCTest {

    @Test
    public void demo01() throws Exception {
        // 目标: 查询用户表的所有数据
        String url = "jdbc:mysql://localhost:3306/day03";
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
        Class.forName("cn.itcast.a_jdbc.User");
    }

    @Test
    public void demo03() throws Exception {
        User user = new User();
    }

    @Test
    public void demo04() {
        // 需求: 根据用户名和密码查询用户数据
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_day0301";
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
            String sql = "select * from tb_user where username=? and password=?";
            stmt = conn.prepareStatement(sql);
            // 3.1 如果有? , 就需要输入值
            stmt.setString(1, "wangwu");
            stmt.setString(2, "123");
            // 4 执行sql 获取结果
            rs = stmt.executeQuery();
            // 5 处理结果
            if(rs.next()) {
                int uid = rs.getInt("uid");
                String uname = rs.getString("username");

                System.out.println(uid + " ==== " + uname);
                System.out.println("恭喜你,登录成功");
            } else {
                System.out.println("用户名或密码错误!");
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

    @Test
    public void demo05()  {
        // 需求2: 插入一条sql语句
    }

    @Test
    public void demo06() {
        // 需求3: 修改
    }

    @Test
    public void demo07()  {
        // 需求4: 删除
    }

}
