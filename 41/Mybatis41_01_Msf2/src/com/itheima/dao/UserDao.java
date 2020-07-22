package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.List;

public interface UserDao {

    //  根据用户id查询一个用户信息
    User findById(int id);
    //  根据用户名称模糊查询用户信息列表
    List<User> findByName(String name);
    //  添加用户信息
    void addUser(User user);

}
