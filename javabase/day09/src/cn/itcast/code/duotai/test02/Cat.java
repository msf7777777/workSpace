package cn.itcast.code.duotai.test02;

public class Cat extends Animal {
    int num = 20;
    int zinumber = 30;

    public void method(){
        System.out.println("我是子类的方法");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void methodZi(){
        System.out.println("我是子类特有的方法");
    }
}
