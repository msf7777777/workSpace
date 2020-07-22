package cn.itcast.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
6.1-100随机生成10个不重复的数组放入集合, 实现奇数放左边,偶数放右边
 */
public class Test06_new {
    public static void main(String[] args) {
        //
        int[] arr = new int[10];
        Random r = new Random();
        int index = 0;
        while (index !=10){
            int number = r.nextInt(100) + 1;
            //判断number是否在数组中存在
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == number){
                    count++;
                    break;
                }
            }
            if(count == 0){//证明不存在
                arr[index] = number;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arrNew = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;
            if(arr[i] % 2 == 1){
                arrNew[i - left] = arr[i];
                left++;
            }else{
                arrNew[arr.length - 1 - right] = arr[i];
                right++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
