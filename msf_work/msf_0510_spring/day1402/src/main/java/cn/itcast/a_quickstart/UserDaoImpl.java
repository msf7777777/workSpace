package cn.itcast.a_quickstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="cn.itcast.a_quickstart.UserDaoImpl"/>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Value("麻少飞的公司")
    private String company;

    @Override
    public void queryUserByNameAndPassword() {
        System.out.print("【1】调用数据层 【UserDaoImpl】 的 【queryUserByNameAndPassword()】方法.... ...");
        System.out.println(" 公司名称："+ company);
    }
}
