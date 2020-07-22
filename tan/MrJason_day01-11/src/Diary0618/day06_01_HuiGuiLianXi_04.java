package Diary0618;

import java.util.Scanner;

public class day06_01_HuiGuiLianXi_04 {
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("〓你好，朋友！我是来自暗网的琴痴〓");
		System.out.println("【圣诞节到了，祝你圣诞节快乐！！】");
		System.out.println("|●我有一棵圣诞树作为礼物送给你●|");
		System.out.println("|●并且你还可以自己描绘她的样子●|");
		System.out.println("〓下面请说出你希望你圣诞树的样子〓");
		System.out.println("************************");
		System.out.println(" ");
		System.out.println("************************");
		
		Scanner s = new Scanner(System.in);
		System.out.println("№ 最高10层，你希望他是多少层？ №");
		System.out.println("************************");
		int a = s.nextInt();
		s.close();
		//三角图的编译
		int kg = a - 1;//三角图第一行空格的数
		for(int x = 1;x <= a;x++){//三角图的行数
			//三角图每行之前的空格
			for(int y = 1;y <= kg;y++){//三角图每行之前的空格
				System.out.print(" ");
			}
			//三角图每行的“*”的个数
			for(int z = 1;z <= a - kg  ;z++){//三角图每行的“*”的个数
				System.out.print("*");
				System.out.print(" ");//每两个“*”之间都会有一个空格
			}
			System.out.println("（这里的空格怎么解决？）");
			System.out.println("");
			kg--;
		}
		
		//矩形图的编译
		for(int m = 1;m <= a - 2;m++){//矩形图的行数
			//矩形图每行之前的空格
			for(int n = 1;n <= a - 2;n++){//矩形图每行之前的空格
				System.out.print(" ");
			}
			System.out.print("*" + " " + "*");
			System.out.println("（这里没有空格）");
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
	}
}
