package cn.itcast.code.debug;

public class Test01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a, b);
        System.out.println("sum: " + sum);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
