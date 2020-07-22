package cn.itcast.code.overload;

public class Test01 {
    public static void main(String[] args) {
        int sum = getSum(1,2);
        System.out.println(sum);
        sum = getSum(1,2,3);
        System.out.println(sum);
        byte a = 10;
        byte b = 20;
        int sum1 = getSum(a, b);
        System.out.println(sum1);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int getSum(byte a, byte b) {
        return a - b;
    }
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
