package cn.itcast.a_quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//将接口实现类交给spring管理
//<bean id="userService" class="cn/itcast/a_quickstart/UserServiceImpl.java:7"/>
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    //@Autowired 自动装配 根据类型自动匹配
    //<property name="userDao" ref="userDao"></property>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    @Qualifier("userDao2")
    private UserDao userDao2;

    @Value("#{userDao2}")
    private UserDao userDao3;


    @Override
    public void login() {
        //【demo02】
        System.out.println("1 调用业务层的login()方法.... ...");
        //调用dao执行方法
        userDao.queryUserByNameAndPassword();
        userDao2.queryUserByNameAndPassword();
        userDao3.queryUserByNameAndPassword();
    }
}
