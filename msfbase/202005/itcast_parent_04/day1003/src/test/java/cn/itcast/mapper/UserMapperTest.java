package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    // 类似于 UserDao
    UserMapper userMapper;

    @Before
    public void init() throws Exception {
        // 获取sqlSessionFactory
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 通过SqlSession获取 UserMapper接口的实现类, 通过mybatis实现的
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void queryById() {
        User user = userMapper.queryById(1L);
        System.out.println(user);
    }

    @Test
    public void queryById2() {
        User user = userMapper.queryById2(1L);
        System.out.println(user);
    }

    @Test
    public void queryAll() {
        List<User> userList = userMapper.queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setuserName("sunhonglei");
        user.setPassword("123");
        user.setName("孙红雷");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());

        userMapper.insertUser(user);
        System.out.println("新增的用户编号: " + user.getId());
    }

    @Test
    public void insertUser2() throws Exception {
        User user = new User();
        user.setuserName("libingbing");
        user.setPassword("123");
        user.setName("李冰冰");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());

        userMapper.insertUser2(user);
        System.out.println("新增的用户编号: " + user.getId());
    }

    @Test
    public void insertUser3() throws Exception {
        User user = new User();
        user.setuserName("zhangweijian");
        user.setPassword("123");
        user.setName("张卫健");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());

        userMapper.insertUser3(user);
        System.out.println("新增的用户编号: " + user.getId());
    }

    @Test
    public void updateUser() throws Exception {
        // 需求: 修改: 将张三的年龄修改为250岁
        // 1 查到张三的信息
        User user = userMapper.queryById(1L);
        System.out.println(user);
        System.out.println("==========================");
        // 2 修改
        user.setAge(100);
        userMapper.updateUser(user);
    }

    @Test
    public void delById() throws Exception {
        userMapper.delById(8L);
    }

    @Test
    public void queryByUsernameAndPassword() throws Exception {
        User user = userMapper.queryByUsernameAndPassword("zhangweijian' -- ", "123sdfsdfdsfsfsdf");

        System.out.println(user);
    }

    @Test
    public void queryByUsernameAndPassword2() throws Exception {
        User user = userMapper.queryByUsernameAndPassword2("zhangweijian' -- ", "123sdfsdfdsfsfsdf");

        System.out.println(user);
    }
}