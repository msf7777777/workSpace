package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户信息
     */
    public User qureyByUsernameAndPassword(@Param("username")String username,
                                           @Param("password") String password);

}
