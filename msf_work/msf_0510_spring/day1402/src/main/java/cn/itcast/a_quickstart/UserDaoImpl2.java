package cn.itcast.a_quickstart;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao2" class="cn.itcast.a_quickstart.UserDaoImpl2"/>

// Component 组件
// 问题：因为业务层实现类和数据层实现类的注解都是 Component ，没有办法区分这是哪一层的
// 解决：增加不同注解来区分:
//              Repository    仓库，对应 数据层，持久层
//              Service       业务，对应 业务层
//              Component     组件，如果不确定这个类属于哪一层，就定义成 Component注解
//@Component("userDao2")
@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {
    @Override
    public void queryUserByNameAndPassword() {
        System.out.println("【2】调用数据层 【UserDaoImp2】 的 " +
                "【queryUserByNameAndPassword()】方法.... ...");
    }
}
