package cn.itcast.code.function_practise;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {11,565,6564,66,46,26,55,22};
        printArr(arr);
        int[] arr2 = {22,55,8986,656,122,812,3984,323};
        printArr(arr2);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }
}
