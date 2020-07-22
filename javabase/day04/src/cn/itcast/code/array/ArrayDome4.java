package cn.itcast.code.array;

public class ArrayDome4 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);	//打印数组中的第一个元素, 值为: 0
        System.out.println(arr);    //[I@1540e19d

        int[] arr1 = new int[3];
        System.out.println(arr1);

        arr1 = arr;
        System.out.println(arr);
        System.out.println(arr1);
    }
}
