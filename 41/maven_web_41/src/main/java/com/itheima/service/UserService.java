package com.itheima.service;

import com.itheima.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    //查询所有用户
    public List<User> queryUsers() throws SQLException;
}
