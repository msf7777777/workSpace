package cn.itcast.task;
/*
1. 定义int类型的数组arr, 存储元素11, 22, 33, 44, 55, 通过for循环, 遍历数组.
(要求在控制台中在一行显示,显示格式为:11, 22, 33, 44, 55 )
 */
public class task01 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
