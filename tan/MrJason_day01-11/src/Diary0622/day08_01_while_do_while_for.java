package Diary0622;

public class day08_01_while_do_while_for {
	public static void main(String[] args) {
		int x = 0;
		while(x <= 5){
			System.out.println("我是麻少飞，这是一条病毒" + x);
			x++;
		}
		System.out.println("*******");
		
		int y = 5;
		do{
			System.out.print("麻少飞-");
			y--;
		}while(y > 3);
		System.out.println("琴痴");
		System.out.println("*******");
		
		int m = 7;
		do {
			System.out.println("麻少飞777");
			m--;
		}while(m > 7);
		System.out.println("**************");
		
		//for循环包括三个部分
		//初始化语句：int i = 0; 只执行一次
		//条件语句：i < 5; 代码每次执行之前，都要检查条件语句是否满足，满足就执行，不满足就for循环终止
		//操作语句：i++; 每次代码执行结束之后，执行一次操作语句
		for(int i = 0;i <= 5;i++){
			System.out.println(i);
		}
		System.out.println("**************");
		
		
			
	}
}
