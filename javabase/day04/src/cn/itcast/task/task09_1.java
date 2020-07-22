package cn.itcast.task;
import java.util.Random;
//9. 随机生成10个[1,100]不重复的整数, 存入长度为10数组中, 最终遍历数组.
public class task09_1 {
    public static void main(String[] args) {
        Random random = new Random();
        //创建一个长度为10的数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //定义一个数来接收随机数字
            int number = random.nextInt(100) + 1;
            arr[i] = number;
            System.out.println(arr[i]);
        }
        //
    }
}