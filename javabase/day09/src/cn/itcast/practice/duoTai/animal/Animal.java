package cn.itcast.practice.duoTai.animal;

public class Animal {
    public void bark(){
        System.out.println("不知道怎么叫");
    }
}

class Cat extends Animal{
    public void bark(){
        System.out.println("喵儿~");
    }
    public void eat(){
        System.out.println("猫吃鱼~");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("艹!");
    }
}

class test{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.bark();
//        cat.eat();
        ((Cat) cat).eat();
//        cat.eat();
        Cat catTest = (Cat) cat;
        catTest.eat();
    }
}