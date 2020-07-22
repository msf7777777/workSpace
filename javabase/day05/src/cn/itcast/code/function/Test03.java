package cn.itcast.code.function;

public class Test03 {
    public static void main(String[] args) {
        function();
    }

    public static void function() {
        System.out.println("function已被打印");
    }
    public static void function2() {
        System.out.println("function2已被打印");
        int a = 7;
        int m = 1;
        int temp = a;
        a = m;
        m = a;
    }
}
