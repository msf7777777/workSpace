package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void queryByUsernameAndPassword() throws IOException {
        // 1 获取sqlSession工厂类
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 2 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 3 获取UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 4 执行sql 获取结果
        User user = mapper.queryByUsernameAndPassword("zhangsan", "123456");
        // 5 处理结果
        System.out.println(user);
    }
}