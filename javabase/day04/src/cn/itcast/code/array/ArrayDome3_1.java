package cn.itcast.code.array;

public class ArrayDome3_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr1 [] = new int[6];
        int[] arr2 = new int[]{11,22,33,44,55,66,77};
        int[] arr3 = {11,22,33,44};
        int[] arr5;
        arr5 = new int[]{1,2,3,4,5};
        int length = arr.length;
        System.out.println(arr1[2]);
        System.out.println(arr2[3]);
        arr2[3] = 20;
        System.out.println(arr2[3]);


    }
}