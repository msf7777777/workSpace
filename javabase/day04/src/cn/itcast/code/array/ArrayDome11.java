package cn.itcast.code.array;

public class ArrayDome11 {
    public static void main(String[] args) {
        int[] arr = {12, 25, 365, 452, 35, 24, 87};
        //定义一个擂台
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if(number > max){
                max = number;
            }
        }
        System.out.println(max);
    }
}
