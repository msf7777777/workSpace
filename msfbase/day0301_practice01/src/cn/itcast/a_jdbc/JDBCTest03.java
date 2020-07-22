package cn.itcast.a_jdbc;

import cn.itcast.utils.JDBCUtils;
import org.junit.Test;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest03 {
    @Test
    public void demo01() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // 2 获取连接
            conn = JDBCUtils.getConnection();
            // 3 获取执行sql对象
            String sql = "select * from msf";
            stmt = conn.prepareStatement(sql);
            // 4 执行sql 获取结果
            rs = stmt.executeQuery();
            // 5 处理结果
            while (rs.next()) {
                int uid = rs.getInt("uid");
                String uname = rs.getString("username");
                String upwd = rs.getString("password");
                String nickname = rs.getString("nickname");

//                System.out.println(uid +"============="+ uname +"============="+ upwd +"============="+ nickname);
                System.out.println("ID: " + uid + " 名字: " + uname + " 密码: " + upwd + " 昵称: " + nickname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 6 释放资源
            JDBCUtils.release(conn, stmt, rs);
        }
    }
}
