package cn.itcast.dao;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    UserDao userDao;

    @Before
    public void init() throws IOException {
        // 2 获取执行sql对象的工厂
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 3 获取执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 1 调用dao 执行sql语句
        userDao = new UserDaoImpl(sqlSession);
    }


    @Test
    public void queryById() throws Exception {
        // 4 执行sql 获取结果
        User user = userDao.queryById(1L);
        System.out.println(user);
    }

    @Test
    public void queryAll() throws Exception {
        // 4 执行sql 获取结果
        List<User> userList = userDao.queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setuserName("liubei");
        user.setPassword("123");
        user.setName("刘备");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());

        userDao.insertUser(user);
    }

    @Test
    public void updateUser() throws Exception {
        // 需求: 修改: 将张三的年龄修改为250岁
        // 1 查到张三的信息
        User user = userDao.queryById(1L);
        System.out.println(user);
        System.out.println("==========================");
        // 2 修改
        user.setAge(250);
        userDao.updateUser(user);
    }

    @Test
    public void delById() throws Exception {
        userDao.delById(7L);
    }
}