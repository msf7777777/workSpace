package cn.itcast.code.duotai.test03;

public class Test1 {

    public static void main(String[] args) {
        zha(new Apple());
        zha(new Pear());
        zha(new Banana());
        zha(new Orange());
    }
    public static void zha(Fruit fruit){//让父类或者父接口作为参数, 可以接受所有的子类对象
       //1000行代码
        fruit.getJuice();
    }
   /* public static void zha(Apple apple){
        apple.getJuice();
    }

    public static void zha(Pear pear){
        pear.getJuice();
    }

    public static void zha(Banana banana){
        banana.getJuice();
    }*/
}
