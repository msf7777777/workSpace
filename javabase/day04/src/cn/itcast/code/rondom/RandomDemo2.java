package cn.itcast.rondom;

import java.util.Random;

//如何生成[m,n]之间的随机数
public class RandomDemo2 {
    public static void main(String[] args) {
        //[0,9] ----------> 10
        //[1,10] ---------> nextInt(10) + 1
        //[3,30] ---------> nextInt(28) + 3
        //公式:[m,n] -----> nextInt(n - m + 1) + m

        //生成[100,105]
        Random random = new Random();
        int number = random.nextInt(6)+ 100 ;
        System.out.println(number);
    }
}
