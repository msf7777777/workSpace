package Diary0620;

public class day07_08_switch_ {
	public static void main(String[] args) {
		int x = 100;
		if(x <= 10 && x >=1){
			switch (x) {
			case 1 :
				System.out.println("1");
				break;
			case 10 :
				System.out.println("10");
				break;
			case 100 :
				System.out.println("sb");
				break;	
			}
		}
		System.out.println("**********");
		
		int y = 10;
		switch (y) {
			case 10 :
				System.out.println("10");
				break;
		}
	}
}
