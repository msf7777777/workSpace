package cn.itcast.code.arrayarray;

public class Test02 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(arr[1][1]);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = arr[i];
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
