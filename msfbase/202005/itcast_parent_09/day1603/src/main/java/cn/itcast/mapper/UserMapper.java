package cn.itcast.mapper;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有
     */
    public List<User> queryAll();

}
