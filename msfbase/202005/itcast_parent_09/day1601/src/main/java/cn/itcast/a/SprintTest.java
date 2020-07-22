package cn.itcast.a;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_bak_01.xml")
public class SprintTest {
    @Test
    public void demo01() {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/spring03_db";
        String username = "root";
        String password = "root";

        // 需求: 向数据库中 添加一张表
        // 1.1 创建连接池
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);

        // 1 创建spring操作数据库的核心类
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        // 2 书写sql
        String sql = "create table book(id int primary key auto_increment, name varchar(32), price int)";
        // 3 执行sql
        int count = jdbcTemplate.update(sql);
        System.out.println("影响的条数: " + count);
    }


    // 从spring容器中获取 jdbcTemplate
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void demo02() {
        // 需求: 向book表 插入一条记录
        // 1 书写sql
        String sql = "insert into book(id, name, price) values(null, ?, ?)";
        // 2 执行sql
        Object[] paramArr = {"辟邪剑谱", 1};
        int count = jdbcTemplate.update(sql, paramArr);
        System.out.println(count);
    }

    @Test
    public void demo03() throws Exception {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/spring03_db";
        String username = "root";
        String password = "root";

        // 目标: 获取c3p0连接池
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driverClassName);
        ds.setJdbcUrl(url);
        ds.setUser(username);
        ds.setPassword(password);
    }
}
