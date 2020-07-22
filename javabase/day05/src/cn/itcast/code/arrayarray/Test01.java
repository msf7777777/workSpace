package cn.itcast.code.arrayarray;

public class Test01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[2][3] = 100;
        System.out.println(arr[2][3]);//打印元素
        System.out.println(arr[0]);//打印一维地址
        System.out.println(arr);//打印二维地址
    }
}
