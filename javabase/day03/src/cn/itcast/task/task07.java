package cn.itcast.task;
	/*
	7. 某人想买车，没什么车决定于此人在银行有多少存款(键盘录入)。
		如果此人的存款超过500万，则买奥迪A8L；
	    否则，如果此人的存款超过100万，则买奥迪A6L；
	    否则，如果此人的存款超过50万，则买奥迪A4L；
	    否则，如果此人的存款超过10万，则买大众速腾；
	    否则此人买大众捷达。
    */
import java.util.Scanner;
public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入存款多少
        System.out.println("请输入存款多少：");
        int money = sc.nextInt();
        if(money < -500000000 || money > 500000000){
            System.out.println("fuck off");
        }else if(money >= 5000000){
            System.out.println("您有存款 " + money + "可以买奥迪A8L");
        }else if(money >= 1000000){
            System.out.println("您有存款 " + money + "可以买奥迪A6L");
        }else if(money >= 500000){
            System.out.println("您有存款 " + money + "可以买奥迪A4L");
        }else if(money >= 100000){
            System.out.println("您有存款 " + money + "可以买大众速腾");
        }else{
            System.out.println("您有存款 " + money + "可以买大众捷达");
        }
    }
}
