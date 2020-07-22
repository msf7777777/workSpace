package cn.itcast.a_quickstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// <bean id="userDao" class="cn.itcast.a_quickstart.UserDaoImpl"/>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Value("传智播客")
    private String company;

    @Override
    public void queryUserByNameAndPassword() {
        System.out.println("111111111111 调用数据层 UserDaoImpl的queryUserByNameAndPassword() ... ...公司名称: " + company);
    }
}
