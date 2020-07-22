package cn.itcast.b_helloMybatis;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class QuickStart {
    public static void main(String[] args) throws Exception {
        // 1 获取mybatis核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 2 获取 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3 执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 4 执行
        User user = sqlSession.selectOne("UserMapper.queryById", 1L);

        System.out.println(user);
    }
}
