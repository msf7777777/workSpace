package Diary0622;

public class day08_03_break {
	public static void main(String[] args) {
		//break语句可以使循环终止
		//break在哪个循环体中，就会导致哪个循环中止
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//【0123456789】
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//【012345】
			if(x == 5){
				break;
			}
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x < 10;x++){
			System.out.print(x);//【】
		}
		System.out.println();
		System.out.println("***************");
		
		for(int a = 1;a <= 5;a++){//【卷】
			for(int b = 1;b <= 4;b++){//【章】
				for(int c = 1;c <= 3;c++){//【节】
					System.out.println("第" + a + "卷" + "第" + b + "章" + "第" + c + "节");
					if(c == 2){
						break;
					}
				}
				if(b == 3){
					break;
				}
				
			}
			if(a == 4){
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
