package Diary0623_00;

import java.util.Scanner;

public class day0718_05_03 {
	public static int msf(int x,int y,int z) {
		return x > y ? (x > z ? x : z) : (y > z ? y : z);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("№ 输入_x的值 №");
		int X = s.nextInt();
		
		System.out.println("№ 输入_y №");
		int Y = s.nextInt();
		
		System.out.println("№ 输入_z №");
		int Z = s.nextInt();
		
		msf(X,Y,Z);	
		
		System.out.println("答案揭晓，最大值是");
		
		System.out.println(msf(X,Y,Z) + "，你的" + msf(X,Y,Z));
		
		s.close();
	}
}
