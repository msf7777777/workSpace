package cn.itcast.d_lifecycle;

import cn.itcast.c_scope.PrototypeBean;
import cn.itcast.c_scope.SingletonBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {


    @Test
    public void demo01() {
        // 需求: 从spring容器中获取singletonBean
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifecycleBean lifecycleBean = ac.getBean("lifecycleBean", LifecycleBean.class);
        lifecycleBean.sayHello();
        ((ClassPathXmlApplicationContext) ac).close();
    }


}
