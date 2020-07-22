package cn.itcast.demo;

public class StaticFactoryBean {

    public StaticFactoryBean() {
        System.out.println("【StaticFactoryBean】の“★★★【无参构造方法】★★★” " );

    }

    public static User getUser() {

        System.out.println("【StaticFactoryBean】の“★★★【getUser】★★★” " );

        return new User();

    }
}
