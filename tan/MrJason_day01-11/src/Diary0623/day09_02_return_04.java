package Diary0623;

import java.util.Scanner;

public class day09_02_return_04 {
	public static void main(String[] args) {
		String boy = "human";
		String girl = "human";
		boolean Human = boy == girl;
		System.out.println(boy);
		System.out.println(girl);
		System.out.println(Human);
		
		Scanner s = new Scanner(System.in);
		System.out.println(" ‰»Î°∞human°±");
		String b = s.next();
		String g = "human";
		boolean H = b .equals(g);
		System.out.println(b);
		System.out.println(g);
		System.out.println(H);
		
		System.out.println(" ‰»Î°∞1°±");
		int x = s.nextInt();
		int y = 1;
		boolean z = x == y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		s.close();
	}
}
