package com.itheima.service;

import com.itheima.dao.UserDaoImpl;
import com.itheima.pojo.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<User> queryUsers() throws SQLException {
        //创建UserDao,调用他的查找所有用户的方法
        return new UserDaoImpl().findUsers();
    }
}
