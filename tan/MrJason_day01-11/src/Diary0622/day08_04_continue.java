package Diary0622;

public class day08_04_continue {
	public static void main(String[] args) {
		//continue语句会跳过代码后续的语句，并开始执行下一个迭代
		//continue在哪个循环体中，就会跳过代码后续的语句
		//continue和break都可以在while和do while中使用
		//与break一样，continue在哪个循环中就对那个循环起作用
		//continue只对内层循环中起作用
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//【0123456789】
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			if(x == 5){
				continue;
			}
			System.out.print(x);//【01234678910】
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//【012345】
			if(x >= 5){
				break;
			}
			
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			if(x >= 3 && x <= 6){
				continue;
			}
			System.out.print(x);//【01278910】
		}
		System.out.println();
		System.out.println("***************");
		
		int x = 0;
		while(x < 10){
			x++;
			if(x == 5){
				continue;
			}
			System.out.println("病毒" + " " + x);
		}
		System.out.println("【hi】");
		System.out.println("***************");
		
		int z = 0;
		while(z < 10){
			
			System.out.println("病毒" + " " + z);
			if(z == 10){
				continue;
			}
			z++;
		}
		System.out.println();
		System.out.println("***************");
		System.out.println("***************");
		//与break一样，continue在哪个循环中就对那个循环起作用
		//continue只对内层循环中起作用
		
		
		
		
		
		
		
		
		
	}
}
