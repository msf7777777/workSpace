package cn.itcast.task;

import java.util.Arrays;

public class task11_teacher {
    public static void main(String[] args) {

        int[] arr = {12, 31, 43, 35, 356, 435, 4636, 23, 234, 432532};
        System.out.println(Arrays.toString(arr) + "[原数组]");
        //1.创建一个长度和原数组一样的数组
        int[] newArr = new int[arr.length];
        //2.定义索引,分别描述left和right
        int left = 0;
        int right = arr.length - 1;
        //3.遍历老数组, 拿到每一个元素
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            //对这个number进行判断
            if (number % 2 == 0) {
                //偶数
                newArr[right] = number;
                //右边索引放一个,要--
                right --;
            }else{
                //奇数
                newArr[left] = number;
                //左索引放一个,要++
                left++;
            }
        }
        System.out.println(Arrays.toString(newArr) + "[调整过的数组]");
    }
}
