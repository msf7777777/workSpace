package com.itheima.demo;

import com.itheima.pojo.User;
import com.itheima.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisDemo01 {

    @Test // findAll
    public void findAll() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        List<User> users = session.selectList("findAll");

        System.out.println(users);

    }

    @Test // findById
    public void findById() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        // 执行查询，因为我们知道结果只有一条，我们使用selectOne
        User user = session.selectOne("findById", 1);

        System.out.println(user);

    }

    @Test // findByName
    public void findByName1() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        //执行查询 命名空间+语句id
        List<User> users = session.selectList("test.findByName1","%麻%");

        System.out.println(users);

    }

    @Test // findByName
    public void findByName2() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        //执行查询 命名空间+语句id
        List<User> users = session.selectList("test.findByName2","张");

        System.out.println(users);

    }

    @Test // addUser
    public void addUser() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        // 创建需要保存的User
        User user = new User();
        user.setUsername("周嘉碧");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("四川自贡");
        System.out.println(user);

        // 执行插入
        session.insert("test.addUser",user);

        // 提交事务
        session.commit();

        System.out.println(user);
    }

    @Test // addUser
    public void addUser2() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession();

        // 创建需要保存的User
        User user = new User();
        user.setUsername("周嘉碧");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("四川自贡");
        System.out.println(user);

        // 执行插入
        session.insert("test.addUser2",user);

        // 提交事务
        session.commit();

        System.out.println(user);
    }

    @Test // addUser
    public void addUser3() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession(true);

        // 创建需要保存的User
        User1 user = new User1();
        user.setUsername("周嘉碧");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("四川自贡");
        System.out.println(user);

        // 执行插入
        session.insert("test.addUser3",user);

        // 提交事务
        session.commit();

        System.out.println(user);
    }

    @Test // updateUser
    public void updateUser() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession(true);

        // 创建需要保存的User
        User user = new User();
        user.setId(35);
        user.setUsername("周嘉碧是辣鸡儿");

        // 执行修改
        session.update("test.updateUser",user);

        System.out.println(user);
    }

    @Test // deleteById
    public void deleteById() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了SqlSession
        SqlSession session = factory.openSession(true);

        // 执行修改
        int result = session.delete("test.deleteById", 33);
        int result2 = session.delete("test.deleteById", 34);

        System.out.println("删除了多少行:" + result);
        System.out.println("删除了多少行:" + result2);
    }
}