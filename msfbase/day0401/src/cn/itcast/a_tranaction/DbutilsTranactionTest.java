package cn.itcast.a_tranaction;

import cn.itcast.utils.DruidUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DbutilsTranactionTest {
    @Test
    public void demo01() {
        // 目标: 通过dbutils控制事务
        Connection conn = null;

        try {
            // 3 获取连接
            conn = DruidUtils.getConnection();
            // 4 开启事务
            conn.setAutoCommit(false);
            // 1 创建核心对象
            QueryRunner qr = new QueryRunner(); // 这是无参数的queryruuner
            // 2 执行sql
            qr.update(conn, "update tb_account set money=money-100 where name='a'");

            // 制造异常
            int j = 1/0;

            qr.update(conn, "update tb_account set money=money+100 where name='b'");
            // 5 结束事务
            // 5.1 提交事务 且 关闭资源
            DbUtils.commitAndCloseQuietly(conn);
        } catch (Exception e) {
            e.printStackTrace();
            // 5.2 回滚事务 且 关闭资源
            DbUtils.rollbackAndCloseQuietly(conn);
        }
    }
}
