package cn.itcast.task;
/*
6. 已知序列1, 1, 2, 3, 5, 8, 13..., 求第12个数字是多少.
 */
public class task06 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        //定义数组前两个数
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 12; i++) {
            arr[i] = arr[i - 1 ] + arr[i - 2 ];
        }
        System.out.println(arr[11]);
    }
}
