package cn.itcast.dao;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * 根据编号查询用户信息
     */
    public User queryById(Long id);

    /**
     * 查询所有用户
     */
    public List<User> queryAll();

    /**
     * 插入一条sql语句
     */
    public void insertUser(User user);

    /**
     * 修改
     */
    public void updateUser(User user);

    /**
     * 根据id 删除对应的用户
     */
    public void delById(Long id);

}
