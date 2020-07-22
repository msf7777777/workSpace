package cn.itcast.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service
//@Controller
//@Repository
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("UserDaoImpl1")
    UserDao userDao;

    @Resource(name="UserDaoImpl1")
    UserDao userDao2;

    @Autowired
    UserDao userDaoImpl;
    @Autowired
    UserDao userDaoImp2;

    @Value("麻志强")
    private String name;

    @Override
    public void findUsers() {
        System.out.println("******* 【UserServiceImpl】の findUsers *******");
        System.out.print("【userDao】:");
        userDao.findUsers();
        System.out.print("【userDao2】:");
        userDao2.findUsers();

        System.out.print("【userDaoImpl】:");
        userDaoImpl.findUsers();
        System.out.print("【userDaoImp2】:");
        userDaoImpl.findUsers();

        System.out.println(name);
    }
}
