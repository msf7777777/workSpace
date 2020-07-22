package cn.itcast.task.task07_PingPangAndBasketball;

public class BasketballPlayer extends Player {
    //1.继承父类抽象方法并定义
    @Override//超类Human,父类Player
    public void eat() {
        System.out.println("我是篮球球运动员" + getName() + ",我每天吃篮球.");
    }

    @Override//父类Player
    public void train() {
        System.out.println(getAge() + "岁的我学习如何运球和投篮.");
    }

    //2.构造无参&有参函数
    public BasketballPlayer() {
    }
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
