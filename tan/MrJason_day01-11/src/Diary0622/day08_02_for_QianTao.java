package Diary0622;

import java.util.Scanner;

public class day08_02_for_QianTao {
	public static void main(String[] args) {
		for(int x = 0,y = 9;x <= 5 && y >= 5;x++,y--){
			System.out.print(x);
			System.out.print(y);
			System.out.println();
		}
		System.out.println("**********");
		
		
		//for循环的嵌套
		//每个联系都有1-3题，做四个练习
		//练习1的第1题
		//练习1的第2题
		//练习1的第3题
		//练习2的第1题
		//练习2的第2题
		//练习2的第3题
		//练习3的第1题
		//练习3的第2题
		//练习3的第3题
		//练习4的第1题
		//练习4的第2题
		//练习4的第3题
		
		for(int a = 1;a <= 3;a++){
			System.out.println(a);
		}
		for(int b = 1;b <= 3;b++){
			System.out.println(b);
		}
		for(int c = 1;c <= 3;c++){
			System.out.println(c);
		}
		
		
		
		for(int x = 1;x <= 4;x++){
		//外层的for循环
			System.out.println("做练习" + x);
			for(int y = 1;y <= 3;y++){
			//内层的for循环
				System.out.println("第" + y + "题");
			}
		}
		System.out.println("**********");
		
		for(int a = 1;a <= 2;a++){
			//外层的for循环
			System.out.println("第" + a + "卷");
			for(int b = 1;b <= 2;b++){
			//内层的for循环
				System.out.println("第" + b + "章");
				for(int c = 1;c <= 2;c++){
					System.out.println("第" + c + "节");
				}
			}
		}
		System.out.println("**********");
		
		for(int x = 1,y = 1;x <= 4 && y <= 3;x++,y++){
			System.out.print("练习" + x);
			System.out.println("第" + y + "题");
			
		}
		System.out.println("**********");
		
		for(int x = 1;x <= 4;x++){
			for(int y = 1;y <= 3;y++)
				System.out.println("练习" + x + "第" + y + "题");
				
		}
		System.out.println("*********************");
		
		for(int a = 1;a <= 2;a++){
			for(int b = 1;b <= 3;b++){
				for(int c = 1;c <= 4;c++){
					System.out.println("第" + a + "卷" + "第" + b + "章" + "第" + c + "节");
				}
			}
		}
		System.out.println("*********************");	
		
		Scanner s = new Scanner(System.in);
		System.out.println("有几卷？");
		int a = s.nextInt();
		System.out.println("有几章？");
		int b = s.nextInt();
		System.out.println("有几节？");
		int c = s.nextInt();
		for(int x = 1;x <= a;x++){
			for(int y = 1;y <= b;y++){
				for(int z = 1;z <= c;z++){
					System.out.println("第" + x + "卷" + "第" + y + "章" + "第" + z + "节");
				}
			}
		}
		s.close();
		System.out.println("*********************");
		
		int m = 1;
		while(m <= 3){
			int n = 1;
			while(n <=4){
				System.out.println("第" + m + "章" + "第" + n + "节");
				n++;
			}
			m++;
		}
		System.out.println("*********************");
		
		int aa = 1;
		do{
			System.out.println(aa);
			aa++;
		}while(aa < 3);
		System.out.println("*********************");
		
		int bb = 2;
		while(bb <= 4){
			System.out.println(bb);
			bb++;
		}
		System.out.println("*********************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}