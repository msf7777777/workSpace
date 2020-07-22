package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 根据编号查询用户信息
     */
    public User queryById(Long id);

    /**
     * 根据编号查询用户信息
     */
    public User queryById2(@Param("id") Long id);

    /**
     * 查询所有用户
     */
    public List<User> queryAll();

    /**
     * 插入一条sql语句
     */
    public void insertUser(User user);

    /**
     * 插入一条sql语句, 获取新增的用户编号
     */
    public void insertUser2(User user);

    /**
     * 插入一条sql语句, 获取新增的用户编号
     */
    public void insertUser3(User user);

    /**
     * 修改
     */
    public void updateUser(User user);

    /**
     * 根据id 删除对应的用户
     */
    public void delById(Long id);

    /**
     * 根据用户名和密码查询用户信息
     */
    public User queryByUsernameAndPassword(@Param("username") String username,
                                           @Param("password") String password);


    /**
     * 根据用户名和密码查询用户信息
     */
    public User queryByUsernameAndPassword2(@Param("username") String username,
                                           @Param("password") String password);


}
