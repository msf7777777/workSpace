package com.itheima.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class AccountMapperTest {

    private SqlSessionFactory factory;

    //初始化SqlSession 会话对象
    @Before
    public void init() throws IOException {
        //1.获取SqlSessionFactoryBuider
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //2.Resources 获取流
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //3.调用build方法获取SqlSessionfactory工厂对象
        factory = builder.build(inputStream);
    }

    //测试入账
    @Test
    public void transferInTest() {
        //4.获取openSession 获取sqlSession
        SqlSession sqlSession = factory.openSession(true);
        //5.sqlSession getMapper 获取接口的子类代理对象
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        //6.调用transferIn 方法
        mapper.transferIn("aaa",200);


    }

    //测试出账
    @Test
    public void transferOut() {
        //4.获取openSession 获取sqlSession
        SqlSession sqlSession = factory.openSession(true);
        //5.sqlSession getMapper 获取接口的子类代理对象
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        //6.调用transferOut 方法
        mapper.transferOut("bbb",200);
    }
}