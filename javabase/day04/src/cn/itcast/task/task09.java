package cn.itcast.task;

import java.util.Random;

/*
9. 随机生成10个[1,100]不重复的整数, 存入长度为10数组中, 最终遍历数组.
 */
public class task09 {
    public static void main(String[] args) {
        Random random = new Random();
        //创建一个长度为10的数组
        int[] arr = new int[10];
        //定义一个数来接收随机数字
        int number;
        int number2;
        //定义一个数来排除重复值
        int j = random.nextInt(9);
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(100) + 1;
            number2 = random.nextInt(100) + 1;
            for(j = 0;j < 10;j++){
                arr[j] = number2;
                if (arr[i] != arr[j] && i != j) ;
                {
                    arr[i] = number;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}