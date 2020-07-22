package cn.itcast.dao;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> queryAll() throws Exception;
}
