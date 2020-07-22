package cn.itcast.code.function_practise;

public class Test06 {
    public static void main(String[] args) {
        // 定义变量
        int a = 10;
        int b = 20;
        System.out.println("main a:" + a + ",b:" + b);
        change(a, b);
        System.out.println("main a:" + a + ",b:" + b);
    }
    public static void change(int a, int b) {
        System.out.println("change a:" + a + ",b:" + b);
        a = b;
        b = a + b;
        System.out.println("change a:" + a + ",b:" + b);
    }
}
