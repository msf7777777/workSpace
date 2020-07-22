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
public class task14_teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提高 变量的作用域
        int num;
        while(true){
            //1.请输入一个三位数
            System.out.println("请输入一个三位数");
            num = sc.nextInt();
            //2.判断num是否是一个三位数
            if(num >= 100 && num <= 999){
                break;
            }else{
                System.out.println("fuck off");
            }
        }
        //代码如果走到这里,用户一定舒服了一个三位数!!!!
        //3.定义变量接受满足条件的数字和
        int sum= 0;
        //4.拿到100 到num之间所有的三位数
        for(int i = 100;i <= num;i++){
            //5.求i的各个位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if(ge != 7 && shi != 5 && bai != 3){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
