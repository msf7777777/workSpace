package com.itheima.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("MSF...........用户登录完毕..");
    }
}
