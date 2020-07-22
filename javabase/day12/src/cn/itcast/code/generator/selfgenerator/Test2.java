package cn.itcast.code.generator.selfgenerator;

public class Test2 {

    public static void main(String[] args) {

        method("aaa");
        method(123);
        method(new Object());

    }

    public static <T> T method( T t){

        return t;
    }

    public static void method(){

    }
}
