package cn.itcast.code.duotai.test01;

public class Cat extends Animal {
    int num = 20;
    int ziNumber = 30;

    public void method(){
        System.out.println("我是子类的方法");
    }

    public void methodZi(){
        System.out.println("我是子类特有的方法");
    }
}
