package cn.itcast.a_quickstart;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// component 组件
// 问题: 因为业务层实现类和数据层实现类的注解都是 Component, 没有办法这是这是那一层?
// 解决: 增加不同注解来区分:
//              Repository 仓库, 对应 数据层, 持久层
//              service     业务, 对应 业务层
//              component   组件, 如果这个类不确定他是哪一层, 定义成  component注解
//@Component("userDao2")
@Repository("userDao2")
public class UserDaoImpl02 implements UserDao {
    @Override
    public void queryUserByNameAndPassword() {
        System.out.println("2222222222 调用数据层22222 的 queryUserByNameAndPassword 方法");
    }
}
