package cn.itcast.code.a_jdbc;

public class User {
    static {
        System.out.println("1 执行user类的静态代码块!");
    }

    public User() {
        System.out.println("2 执行user类的构造方法!");
    }
}
