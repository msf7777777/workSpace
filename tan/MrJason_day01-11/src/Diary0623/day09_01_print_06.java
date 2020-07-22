package Diary0623;

import java.util.Scanner;

public class day09_01_print_06 {
	public static void printM(boolean n) {//随便写的
		if(n){
			System.out.println("暂无匹配");
		}else{
			System.out.println("来啦？老弟！进来看看吧~");
		}	
	}
	public static void mainX(String[] args) {
		System.out.println("你好！");	
	}
	public static void main(String[] args) {
		System.out.println("男大当嫁  Come on！帮你找个媳妇吧！");
		System.out.println("请如实回答下面的问题");
		Scanner s = new Scanner(System.in);
		System.out.println("〓你希望她的颜值是多少？（0-100）〓");
		int a = s.nextInt();
		System.out.println("〓请说出你的颜值是多少？（0-100）〓");
		int b = s.nextInt();
		boolean n = a >= b;
		if(a >=0 && a <= 100 && b >= 0 && b <= 100){
			printM(n);
		}else{
			System.out.println("草你妈！玩儿呢？");
		}
		s.close();
	}
	public static void mainY(String[] args) {
		System.out.println("你好！");	
	}
}
