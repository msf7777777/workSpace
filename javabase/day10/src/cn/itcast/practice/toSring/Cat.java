package cn.itcast.practice.toSring;

public class Cat extends Animail {
    public static void main(String[] args) {
        Animail cat = new Animail("张嘉敏", 24);
        String catPrint = cat.toString();
        System.out.println(catPrint);//Animail{name='张嘉敏', age=24}
        System.out.println(cat);//Animail{name='张嘉敏', age=24}
    }
}
