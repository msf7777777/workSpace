package cn.itcast.code.main;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void method(int a,int b){
        a =40;
        b = 100;
    }
}
