package cn.itcast.code.array;

public class ArrayDome3 {
    public static void main(String[] args) {
        //1.动态初始化创意一个未知元素的5个元素的数组
        int[] arr = new int[5];
        //2.打印数组中第三个元素的值
        System.out.println(arr[2]);
        //3.给数组中第一个元素赋值111
        arr[0] = 11;
        //4.获取数组中的一个元素值,并将其赋值给变量a,然后打印
        int a = arr[0];
        System.out.println(a);
        //5.打印数组的长度
        int length = arr.length;
        System.out.println(length);
    }
}