package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao{


    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super();
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public User findById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行查询逻辑
        User user = sqlSession.selectOne("com.itheima.dao.UserDao.findById", id);
        // 释放资源
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findByName(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("com.itheima.dao.UserDao.findByName", name);
        sqlSession.close();
        return users;
    }

    @Override
    public void addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.insert("com.itheima.dao.UserDao.addUser",user);

        sqlSession.close();
    }
}
