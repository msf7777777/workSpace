package cn.itcast.staticmethod;

public class ArrayUtil {

    //提供打印数组的方法
    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " }");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
