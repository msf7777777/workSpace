package cn.itcast.task;
	/*
	5. 键盘录入一个数字, 判断它是否是水仙花数, 并打印结果.
		尽可能多的用多种思路实现.
		提示: 1. 水仙花数是一个3位数.  2. 它的各个位数的立方和等于它本身.
		例如: 153就是一个水仙花数:  153 = 1*1*1 + 5*5*5 + 3*3*3 = 153;
    */
import java.util.Scanner;
public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.录入一个数字
        System.out.println("请输入千位以下整数：");
        int number = sc.nextInt();
        //2.找出各位的数字
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        //3.判断是否是水仙花数
        if(number == ge * ge * ge + shi * shi * shi + bai * bai * bai){
            System.out.println(number + " 就是一个水仙花数");
        }else{
            System.out.println(number + " 不是一个水仙花数");
        }
    }
}
