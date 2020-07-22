package cn.itcast.code.array;
/*
**需求**

已知序列1, 1, 2, 3, 5, 8, 13..., 求第12个数字是多少.
 */
public class ArrayDome15 {
    public static void main(String[] args) {
        //1.定义一个长度为12的数组,分别记录这个数列中所有的值
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        //2.从第三个月开始,都是前两个月的和
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[4]);
    }
}
