package cn.itcast.c_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {


    @Test
    public void demo01() {
        // 需求: 从spring容器中获取singletonBean
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SingletonBean singletonBean = ac.getBean("singletonBean", SingletonBean.class);
        SingletonBean singletonBean2 = ac.getBean("singletonBean", SingletonBean.class);

        System.out.println(singletonBean);
        System.out.println(singletonBean2);
    }

    @Test
    public void demo02() {
        // 需求: 从spring容器中获取prototypeBean
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        PrototypeBean prototypeBean = ac.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = ac.getBean("prototypeBean", PrototypeBean.class);

        System.out.println(prototypeBean);
        System.out.println(prototypeBean2);
    }


}
