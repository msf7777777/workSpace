package cn.itcast.a_tranaction;

import cn.itcast.utils.DruidUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {
    @Test
    public void demo01()  {
        // 需求：a 向 b 转账 100元。(未添加事务)
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // 1 获取连接
            conn = DruidUtils.getConnection();
            // 2 获取执行sql的对象
            // 3 执行一组sql语句
            // 3.1 a-100
            stmt = conn.prepareStatement("update tb_account set money=money-100 where name='a'");
            stmt.executeUpdate();

            // 制造一个异常
            int j = 1/0;

            // 3.2 b+100
            stmt = conn.prepareStatement("update tb_account set money=money+100 where name='b'");
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4 释放资源
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
    public void demo02()  {
        // 需求：a 向 b 转账 100元。(添加事务处理)
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // 1 获取连接
            conn = DruidUtils.getConnection();
            // 5 开启事务, 不自动提交,
            conn.setAutoCommit(false);
            // 2 获取执行sql的对象
            // 3 执行一组sql语句
            // 3.1 a-100
            stmt = conn.prepareStatement("update tb_account set money=money-100 where name='a'");
            stmt.executeUpdate();

            // 制造一个异常
            int j = 1/0;

            // 3.2 b+100
            stmt = conn.prepareStatement("update tb_account set money=money+100 where name='b'");
            stmt.executeUpdate();

            System.out.println("一切正常, 提交事务, 生效");
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常, 回顾事务, 撤销");
            try {
                if(conn!=null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            // 4 释放资源
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
    public void demo03()  {
        // 需求：a 向 b 转账 100元。(添加事务处理)
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // 1 获取连接
            conn = DruidUtils.getConnection();
            // 5 开启事务, 不自动提交,
            conn.setAutoCommit(false);
            // 2 获取执行sql的对象
            // 3 执行一组sql语句
            // 3.1 a-100
            stmt = conn.prepareStatement("update tb_account set money=money-100 where name='a'");
            stmt.executeUpdate();

            // 3.2 b+100
            stmt = conn.prepareStatement("update tb_account set money=money+100 where name='b'");
            stmt.executeUpdate();

            System.out.println("一切正常, 提交事务, 生效");
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常, 回顾事务, 撤销");
            try {
                if(conn!=null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            // 4 释放资源
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
