package Diary0622;

public class day08_05_ZuoYe_3 {
	public static void main(String[] args) {
		
		System.out.println("************");
		for(int x = 1;x <= 9;x++){
			for(int y = 1;y <= 9;y++){
				if(x >= y){
					System.out.print(x + "*" + y + "=" + x * y + " ");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("************");
		
		for(int m = 1;m <= 9;m++){
			for(int n = 1;n <= m;n++){
				System.out.print(n + "X" + m + "=" + m * n + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
	}
}
