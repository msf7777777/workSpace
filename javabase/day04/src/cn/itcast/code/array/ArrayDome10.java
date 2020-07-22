package cn.itcast.code.array;

public class ArrayDome10 {
    public static void main(String[] args) {
        int[] arr = {12,25,365,452,35,24,87};
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            int number = arr[i];
            if(number % 2 == 1){
                count++;
            }
        }
        System.out.println(count + "个奇数");

    }
}
