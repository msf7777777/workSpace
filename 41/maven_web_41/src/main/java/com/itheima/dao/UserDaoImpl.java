package com.itheima.dao;

import com.itheima.pojo.User;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    //查询所有User
    public List<User> findUsers() throws SQLException {
        /**
         1.创建一个连接池
         2.QueryRunner 对象,构造方法中传递dataSource连接池
         3.调用QueryRunner的查询方法
         query(String sql, BeanListHandler<T> handler , T...obj)  ===> List<T>
         参数1:sql语句,如果sql有参数,使用?占位
         参数2: new BeanListHandler<User>(User.class)
         参数3: Object...obj 可变参数, 给sql中的?号传递参数,按照顺写
         */
        //1.创建一个连接池
        DataSource dataSource = C3P0Utils.getDataSource();
        //2.QueryRunner 对象,构造方法中传递dataSource连接池
        QueryRunner qr = new QueryRunner(dataSource);
        //3.调用QueryRunner的查询方法
        // query(String sql, BeanListHandler<T> handler , T...obj)  ===> List<T>
        List<User> list = qr.query("select * from user", new BeanListHandler<User>(User.class));

        return list;
    }

    @Test
    public void test01() throws SQLException {
        List<User> users = findUsers();
        System.out.println(users);
    }
}
