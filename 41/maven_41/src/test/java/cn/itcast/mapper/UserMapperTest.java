package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void findById() throws Exception {

        //构建出SqlSession
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(Resources.getResourceAsStream("SqlMapCinfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById("77");
        System.out.println(user);
    }

}