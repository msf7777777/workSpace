package cn.itcast.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDao extends JdbcDaoSupport {
    //转账
    public void out(String outAccount, Integer money) {
        //书写sql
        String sql = "update account set money=money-? where name=?";
        //执行sql
        getJdbcTemplate().update(sql, money, outAccount);
    }
    //收款
    public void in(String inAccount,Integer money) {
        //书写sql
        String sql = "update account set money=money+? where name=?";
        //执行sql
        getJdbcTemplate().update(sql, money, inAccount);
    }
    //买礼物
    public void zhuanzhang(String outAccount, String inAccount, Integer money) {
        //书写sql
        String sql = "update account set money=money-? where name=?";
        String sq2 = "update account set money=money+? where name=?";
        //执行sql
        getJdbcTemplate().update(sql, money, outAccount);
        getJdbcTemplate().update(sq2, money, inAccount);
    }
}
