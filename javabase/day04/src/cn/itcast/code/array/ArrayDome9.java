package cn.itcast.code.array;

public class ArrayDome9 {
    public static void main(String[] args) {
        //遍历数组
        int[] arr = {12,25,365,452,35,24,87};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        /*
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        */

    }

}
