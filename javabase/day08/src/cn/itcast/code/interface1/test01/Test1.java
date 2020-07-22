package cn.itcast.interface1.test01;
/*
接口的使用步骤:
    1.定义接口
    2.定义类去实现接口
    3.重写接口中所有的抽象方法
    4.使用实现类
 */
public class Test1 {
    public static void main(String[] args) {
        //A a = new A(); //典型错误, 因为接口中可能有残缺的方法不能直接使用
        AImpl a = new AImpl();
        a.method();
    }
}
