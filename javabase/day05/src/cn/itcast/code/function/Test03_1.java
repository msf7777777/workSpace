package cn.itcast.code.function;

public class Test03_1 {
    public static void main(String[] args) {
        function();
        System.out.println();
        function2();
    }
    public static void function() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void function2() {
        for (int i = 7; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
