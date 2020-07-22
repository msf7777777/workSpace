package cn.itcast.dao;

import cn.itcast.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public User queryById(Long id) {
        User user = sqlSession.selectOne("UserMapper.queryById", id);
        return user;
    }

    @Override
    public List<User> queryAll() {
        List<User> userList = sqlSession.selectList("UserMapper.queryAll");
        return userList;
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("UserMapper.insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("UserMapper.updateUser", user);
    }

    @Override
    public void delById(Long id) {
        sqlSession.delete("UserMapper.delById", id);
    }
}
