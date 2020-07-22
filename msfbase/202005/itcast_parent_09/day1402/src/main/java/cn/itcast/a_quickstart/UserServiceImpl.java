package cn.itcast.a_quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 交接口实现类交给spring管理
// <bean id="userService" class=""cn.itcast.a_quickstart.UserServiceImpl/>
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    // @Autowired 自动装配, 给句类型自动匹配
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Value("#{userDao2}")
    private UserDao userDao2;

    @Override
    public void login() {
        System.out.println("1.调用业务层的login方法 ... ...");
        // 调用dao执行方法
        userDao.queryUserByNameAndPassword();

        userDao2.queryUserByNameAndPassword();


    }
}
