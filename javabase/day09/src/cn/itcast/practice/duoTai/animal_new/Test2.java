package cn.itcast.practice.duoTai.animal_new;

public class Test2 {
    public static void main(String[] args) {
        animalEat(new Cat());
        animalEat(new Dog());
    }
    public static void animalEat(Animal animal){
        animal.eat();
    }
}
