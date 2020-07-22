package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User login(User user) {
        // 调用数据层 根据用户名和密码查询用户信息
        UserDao userDao = new UserDaoImpl();
        User loginUser = null;

        try {
            loginUser = userDao.queryUserByUsernameAndPassword(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return loginUser;
    }
}
