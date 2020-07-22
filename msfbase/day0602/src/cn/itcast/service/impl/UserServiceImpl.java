package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> queryAll() {
        // 调用数据层 查询所有的用户集合信息
        UserDao userDao = new UserDaoImpl();

        List<User> userList = null;
        try {
            userList = userDao.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
