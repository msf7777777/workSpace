package cn.itcast.task;
/*
4. 定义Demo06类, 在main中调用getArrayMax()方法, 用来获取数组中所有元素的最大值.
    目的: 本题主要考察两点.
        1. 有参有返回的方法 的定义和调用.
        2. 方法的形参可以是数组类型的变量.

    提示:
        1. 在main方法外边定义getArrayMax()方法.
        2. getArrayMax()方法接收一个int类型的数组变量.
        3. 在getArrayMax()方法内部实现 获取数组最大值, 并返回.
        4. 在main方法中调用getArrayMax()方法.
*/
public class task04 {
    public static void main(String[] args) {
        int[] arr = {22, 77, 55, 11, 33};
        int max = getArrayMax(arr);
        System.out.println(max);
        int min = getArrayMin(arr);
        System.out.println(min);
    }

    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getArrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
