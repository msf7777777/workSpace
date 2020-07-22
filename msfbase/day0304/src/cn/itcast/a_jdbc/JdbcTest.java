package cn.itcast.a_jdbc;

import cn.itcast.utils.DruidUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {
    @Test
    public void dmeo01() throws Exception {
        // 1 获取连接
        Connection conn = DruidUtils.getConnection();
        // 2 获取执行sql的对象
        String sql = "select * from tb_user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // 3 执行sql 获取结果
        ResultSet rs = stmt.executeQuery();
        // 4 处理结果
        while(rs.next()) {
            String nickname = rs.getString("nickname");
            System.out.println(nickname);
        }
        // 5 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
