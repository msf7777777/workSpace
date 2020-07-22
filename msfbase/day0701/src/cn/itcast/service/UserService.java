package cn.itcast.service;

import cn.itcast.pojo.User;

public interface UserService {
    /**
     * 处理登录业务
     * @param user
     * @return
     */
    User login(User user);
}
