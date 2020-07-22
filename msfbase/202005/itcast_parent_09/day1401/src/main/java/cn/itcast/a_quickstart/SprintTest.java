package cn.itcast.a_quickstart;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {

    @Test
    public void demo01() {
        // 1 测试业务类的方法
        UserService userService = new UserServiceImpl();
        userService.login();
    }

    @Test
    public void demo02() {
        // 1 测试数据层的方法
        UserDao userDao = new UserDaoImpl();
        userDao.findUserByNameAndPwd();
    }


    @Test
    public void demo03() {
        // 需求: 从spring容器中获取dao, 再测试
        // 1 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 从spring容器中获取dao
        // 2.1 方式一: 根据bean的id获取
        //UserDao userDao = (UserDao) ac.getBean("userDao");
        // 2.2 方式二: 根据类型获取
        //UserDao userDao = ac.getBean(UserDao.class);
        // 2.3 方式三: 根据id和类型查询
        // 接口? 可以, 类似于 动物, 让我们的代码扩展性更强
        // 实现类? 可以, 类似于 一只猫
        UserDao userDao = ac.getBean("userDao", UserDao.class);
        UserDaoImpl userDao2 = ac.getBean("userDao2", UserDaoImpl.class);


        userDao.findUserByNameAndPwd();
    }

    @Test
    public void demo04() {
        // 需求: 从spring容器中获取service, 再测试
        // 1 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 从spring容器中获取service
        UserService userService = ac.getBean("userService", UserService.class);

        userService.login();
    }
}
