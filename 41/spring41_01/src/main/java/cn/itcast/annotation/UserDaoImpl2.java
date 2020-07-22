package cn.itcast.annotation;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl2")
public class UserDaoImpl2 implements UserDao {
    @Override
    public void findUsers() {
        System.out.println("******* 【UserDaoImpl2】の findUsers *******");
    }
}
