package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_05_ZuoYe_HunJia_ChongZuo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("身高多少？（CM）");
		int high = s.nextInt();
		System.out.println("存款多少？（RMB）");
		long money = s.nextLong();
		System.out.println("帅吗？（true or false）");
		boolean handsome = s.nextBoolean();
		if(high >= 180 && money >= 10000000 && handsome){
			System.out.println("我要嫁给他！");
		}else if(high <= 180 && money <= 10000000 && !handsome){
			System.out.println("不嫁");
		}else{
			System.out.println("嫁吧，比上不足，比下有余");
		}
		System.out.println("大吉大利，今晚吃鸡");
		
		
		
		
		s.close();
	}
}
