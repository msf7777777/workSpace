package cn.itcast.demo;

public class FactoryBean {

    public FactoryBean() {
        System.out.println("【FactoryBean】の“★★★【无参构造方法】★★★” " );
    }

    public User getUser(){
        System.out.println("【FactoryBean】の“★★★【getUser方法】★★★” " );
        return new User();
    }

}
