package com.itheima.dao;

import com.itheima.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    //查询所有用户
    public List<User> findUsers() throws SQLException;
}
