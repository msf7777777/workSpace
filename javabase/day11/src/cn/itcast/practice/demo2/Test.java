package cn.itcast.practice.demo2;

public class Test {
    public static void main(String[] args) {
        method(new Demo());
    }

    public static void method(Demo demo){
        System.out.println(demo);
    }

    public static Demo method(){
        return new Demo();
    }
}
