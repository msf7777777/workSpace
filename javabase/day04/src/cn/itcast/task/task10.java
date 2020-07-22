package cn.itcast.task;
import java.util.Random;

/*
10. 基于第9题, 生成两个数组, 将数组的交集部分打印到控制台上.
 */
public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        //创建二个长度为10的数组
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        //定义一个数来接收随机数字
        int number;
        int number2;
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(100) + 1;
            number2 = random.nextInt(100) + 1;
            arr[i] = number;
            arr2[i] = number2;
            System.out.println(arr[i] + "[1]");
            System.out.println(arr2[i] + "[2]");
        }
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10; j++){
                if (arr[i] == arr2[j]) ;
                {
                    System.out.println(arr[i] + "[111]");
                    break;
                }
            }
        }
    }
}
