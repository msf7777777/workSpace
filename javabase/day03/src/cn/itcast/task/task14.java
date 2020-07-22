package cn.itcast.task;
	/*
	14. 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
		1. 数字的个位数不为7;
		2. 数字的十位数不为5;
		3. 数字的百位数不为3;

		1. 创建Scanner对象, 用于接收用户录入的数据.
		2. 提示用户录入一个大于100的三位数, 并判断. 只要用户录入的数据不合法, 就让用户一直录入.
		   因为要求用户一直录入, 所以采用循环优化, 又因为不知道循环次数, 所以考虑使用: while 循环.
			num > 100 && num <= 999
		3. 走到这里, 说明用户录入的数据肯定是合法的.
		4. 定义一个求和变量sum, 用来记录数据和.
		5. 通过for循环, 获取100到用户录入的数字之间, 所有的整数.
		6. 将获取到的整数, 判断, 满足条件就累加. 依次累加给变量sum.
		7. 当for循环执行结束后, sum记录的就是我们想要的值, 打印即可.
	*/
	/*死循环，条件恒等于true，代表一致成立
		while(true){

		}
		//for的死循环
		for(;true;){

		}
		//如果boolean表示省略，表示恒等于true
		for(;;){

		}
		死循环一般都会和循环控制的关键字的break结合，
		老满足达到某种条件时，结束死循环的操作
	*/
//javac Task14.java
//java Task14
import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入一个大于100的三位数
        System.out.println("输入一个大于100的三位数");
        int num = sc.nextInt();
        //2.得到number各位数是多少
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        while(num <= 999 && num > 100){
            for(int i = 1;i < 1000-100;i++){
                if(ge % 7 != 0){
                    num += i;
                }else if(shi % 5 != 0){
                    num += i;
                }
            }
        }
    }
}
