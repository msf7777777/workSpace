package cn.itcast.a_mybatis;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        // 1 获取执行sql对象的工厂
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 2 获取执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 3 执行sql 获取结果
        User user = sqlSession.selectOne("UserMapper.queryById", 3L);
        // 4 处理结果
        System.out.println(user);
    }
}
