package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(User user) {
        // 调用数据层 添加用户信息
        UserDao userDao = new UserDaoImpl();
        try {
            userDao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
