package cn.itcast.rondom;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo3 {
    public static void main(String[] args) {
        Random random = new Random();
        //1.随机生成一个数字
        int randomNumber = random.nextInt(100) + 1;
        //2.键盘录入一个数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int guessNumber = scanner.nextInt();
        //3.对比两个数字
        if(guessNumber > randomNumber){
            System.out.println(guessNumber + "大了");
        }else if(guessNumber < randomNumber){
            System.out.println(guessNumber + "小了");
        }else{
            System.out.println(guessNumber + "猜中了");
        }
    }
}
