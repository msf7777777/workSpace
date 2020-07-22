package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {

    @Test
    public void queryAll() throws IOException {
        // 1 获取sqlSessionFactory
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 2 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 3 获取UserMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 4 执行sql 获取结果 处理结果
        List<User> userList = userMapper.queryAll();
        for (User user : userList) {
            System.out.println("========================");
            System.out.println(user);
        }
    }
}