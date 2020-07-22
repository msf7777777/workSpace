package com.itheima.事务;

import com.itheima.c3p0.C3P0Utils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {

    @Test
    public void test01(){
        Connection connection = null ;
        Statement statement = null;
        try {
            //1. 获取连接
            connection = C3P0Utils.getConnection();

            //开启事务
            connection.setAutoCommit(false);
            //2. 根据连接获取语句执行平台
            statement = connection.createStatement();
            //3.执行SQL 获取获取结果集
            String sql1 = "UPDATE account SET  money = money-500 WHERE NAME='关壮壮'";
            String sql2 = "UPDATE account SET  money = money+500 WHERE NAME='冯华荫'";

            int i1 = statement.executeUpdate(sql1);
            int i2 = statement.executeUpdate(sql2);

            //4. 处理结果集
            System.out.println(i1 + "   " + i2);

            // 说明执行都是成功的, 提交事务
            connection.commit();

        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            //5. 释放资源 : 不管事务事务正常执行成功, 最终都应该释放资源
            C3P0Utils.closeAll(null,statement,connection);
        }
    }

}
