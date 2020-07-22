package cn.itcast.interface1.test03;

public class Dog extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
