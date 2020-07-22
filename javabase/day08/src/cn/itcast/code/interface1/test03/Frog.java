package cn.itcast.interface1.test03;

public class Frog extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("青蛙吃虫");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
