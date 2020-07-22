package com.itheima.service;

import com.itheima.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class AccountServiceImpl implements AccountService {
    @Override
    public void transfer(String inName, String outName, double money) throws IOException {
        //1.创建会话工厂构建对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2.Resources加mybatis核心配置文件,得到流
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //3.给成员变量,会话工厂赋值
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(inputStream);
        //4.获取sqlSession对象,设置事务为自动提交
        SqlSession sqlSession = factory.openSession(true);
        //5.调用getMapper
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        //6.mapper 转入钱
        mapper.transferIn(inName,money);
        //7.mapper调用转出钱
        mapper.transferOut(outName,money);
        //8.关闭资源
        inputStream.close();
        sqlSession.close();

    }
}
