package cn.itcast.Test;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
    }
}
