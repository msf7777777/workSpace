package cn.itcast.dao;

import cn.itcast.pojo.User;

public interface UserDao {
    User queryUserByUsernameAndPassword(User user) throws Exception;
}
