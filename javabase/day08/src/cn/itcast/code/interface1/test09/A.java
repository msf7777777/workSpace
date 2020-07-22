package cn.itcast.interface1.test09;

public interface A {
    // 接口中的成员变量是默认被public static final修饰
    //public static final int num = 10;
    //以后接口中常量和抽象方法一般不会一起使用

    int PERSON_SERVICE = 0;
    int INTERNET_SERVICE = 1;
    int PAY_SERVICE = 2;
    int PAY_SELECT_SERVICE = 3;
    int FLOW_SERVICE = 4;
}
