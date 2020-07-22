package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_04_ZuoYe_1_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("你写数字，我来猜这是星期几");
		int day = s.nextInt();
		switch(day){
		case 7 :
			System.out.println("星期日");
			break;
		case 1 :
			System.out.println("星期一");
			break;
		case 2 :
			System.out.println("星期二");
			break;
		case 3 :
			System.out.println("星期三");
			break;
		case 4 :
			System.out.println("星期四");
			break;
		case 5 :
			System.out.println("星期五");
			break;
		case 6 :
			System.out.println("星期六");
			break;
		default :
			System.out.println("滚你妈的！玩儿你爸爸");
			break;
			
		}
		
		s.close();
		
		
		
		
		
		
		
		
	}
}
