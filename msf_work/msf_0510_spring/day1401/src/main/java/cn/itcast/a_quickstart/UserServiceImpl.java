package cn.itcast.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        System.out.println("1.【UserService】 调用业务层的login()方法.......");
        //调用数据层去操作数据库
        userDao.findUserByNameAndPwd();
    }
}
