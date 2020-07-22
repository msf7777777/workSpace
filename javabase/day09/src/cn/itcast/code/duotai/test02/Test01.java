package cn.itcast.code.duotai.test02;
/*
    多态优点:  提高程序的扩展性
    场景: 经常会将父类类型作为参数, 可以接受任何子类对象
 */
public class Test01 {

    public static void main(String[] args) {

        method(new Cat());
        method(new Dog());
        method(new Pig());

    }

    public static void method(Animal a){//Animal a = new Cat() Animal a = new Dog()
        a.eat();
    }
    /*public static void method(Cat cat){
        cat.eat();
    }

    public static void method(Dog dog){
        dog.eat();
    }

    public static void method(Pig pig){
        pig.eat();
    }*/
}
