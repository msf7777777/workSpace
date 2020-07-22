package cn.itcast.service;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> queryAll();
}
