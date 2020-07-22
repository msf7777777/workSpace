package cn.itcast.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
/*
mysql导入：

CREATE TABLE account (

  name varchar(20) NOT NULL,

  money double DEFAULT NULL

);

INSERT INTO account VALUES ('aaa', 1000);

INSERT INTO account VALUES ('bbb', 1000);

 */
public class AccountDao extends JdbcDaoSupport {
    // 出账
    public void out(String outAccount, Integer money) {
        // 书写sql语句
        String sql = "update account set money=money-? where name=?";
        // 执行sql语句
        getJdbcTemplate().update(sql, money, outAccount);
    }

    // 入账
    public void in(String inAccount, Integer money) {
        // 书写sql语句
        String sql = "update account set money=money+? where name=?";
        // 执行sql语句
        getJdbcTemplate().update(sql, money, inAccount);
    }
}
