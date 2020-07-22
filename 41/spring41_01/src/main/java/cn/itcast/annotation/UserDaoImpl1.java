package cn.itcast.annotation;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl1")//dao层用这个
public class UserDaoImpl1 implements UserDao {
    @Override
    public void findUsers() {
        System.out.println("******* 【UserDaoImpl1】の findUsers *******");
    }
}
