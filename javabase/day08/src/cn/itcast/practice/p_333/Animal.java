package cn.itcast.practice.p_333;
//定义实现类：
public class Animal implements LiveAble {
    @Override
    public void fly() {
        System.out.println("自由自在的飞");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fly();
        LiveAble.fuck();
    }
}
