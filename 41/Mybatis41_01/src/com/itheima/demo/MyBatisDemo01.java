package com.itheima.demo;

import com.itheima.pojo.User;
import com.itheima.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisDemo01 {

    @Test
    public void findAll() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();
        // 执行查询,因为结果是多条,我们使用selectList
        List<User> users = session.selectList("test.findAll");

        System.out.println(users);

    }

    @Test
    public void findById() throws Exception {

        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);

        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();

        // 执行查询,因为我们知道结果只有一条,我们使用selectOne
        User user = session.selectOne("findById", 1);

        System.out.println(user);

    }

    @Test
    public void findByName1() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();

        // 执行查询 命名空间+语句id
        List<User> users = session.selectList("test.findByName1","%张%");
        System.out.println(users);
    }

    @Test
    public void findByName2() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();

        // 执行查询 命名空间+语句id
        List<User> users = session.selectList("test.findByName2","张");
        System.out.println(users);
    }

    @Test
    public void addUser1() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();

        // 创建需要保存的User
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");

        System.out.println("插入前:"+user);
        // 执行插入
        session.insert("test.addUser1",user);
        // 提交事务
        session.commit();

        System.out.println("插入后:"+user);
    }

    @Test
    public void addUser2() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession
        SqlSession session = factory.openSession();

        // 创建需要保存的User
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");
        System.out.println(user);
        // 执行插入
        session.insert("test.addUser2",user);
        // 提交事务
        session.commit();

        System.out.println(user);
    }

    @Test
    public void addUser3() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession , 自动提交
        SqlSession session = factory.openSession(true);

        // 创建需要保存的User
        User1 user = new User1();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");
        System.out.println(user);
        // 执行插入
        session.insert("test.addUser3",user);
        // 提交事务
        // session.commit();

        System.out.println(user);
    }

    @Test
    public void updateUser() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession , 自动提交
        SqlSession session = factory.openSession(true);

        // 创建需要保存的User
        User user = new User();
        user.setId(1);
        user.setUsername("张飞");

        // 执行修改
        session.update("test.updateUser",user);

        System.out.println(user);
    }

    @Test
    public void deleteById() throws Exception {
        // 初始化SqlSessionFactory建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 通过建造者建造出工厂
        SqlSessionFactory factory = builder.build(inputStream);
        // 通过会话工厂加工出了 SqlSession , 自动提交
        SqlSession session = factory.openSession(true);


        // 执行修改
        int result = session.delete("test.deleteById", 33);
        System.out.println("删除了多少行:"+result);
    }



}
