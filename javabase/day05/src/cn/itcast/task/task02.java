package cn.itcast.task;
/*
2. 定义Demo02类, 在main中调用getSum()方法, 用来获取两个整数的和.
    目的: 本题主要考察 有参有返回的方法 的定义和调用.

    提示:
        1. 在main方法外边定义getSum()方法.
        2. getSum()方法接收两个int类型的变量.
        3. 在getSum()方法内部实现求两个整数和, 并返回结果.
        4. 在main方法中调用getSum()方法.
*/
public class task02 {
    public static void main(String[] args) {
        int result = getSum(3,5);
        System.out.println(result);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
