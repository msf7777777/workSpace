package cn.itcast.code.array;

public class ArrayDome13 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 333, 4444, 55555};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
