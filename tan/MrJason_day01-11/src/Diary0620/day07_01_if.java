package Diary0620;

public class day07_01_if {
	public static void main(String[] args) {
		if(true){
			System.out.println("麻少飞喜欢张嘉敏");//【麻少飞喜欢张嘉敏】
		}
		int a = 1;
		int b = 2;
		if(a > b){
			System.out.println("麻少飞不爱张嘉敏");//【if不成立】
		}
		
		
		if(a < b){
			System.out.println("麻少飞爱张嘉敏");//【麻少飞爱张嘉敏】
		}
		System.out.println("*********************");
		
		if(false){
			System.out.println("张嘉敏是傻逼");
		}
		System.out.println("*********************");
		
		int x = 5;
		if(x == 5){
			System.out.println("x == 5");
		}
		
		x = 6;
		if(x == 5){
			System.out.println("x == 6");
		}
		
		int y = 6;
		System.out.println("*********************");
		
		int i = 0;
		int j = i+++i+++i+i+++i+i;//【0+1+2+2+3+3】
		System.out.println(j);//【11】
		
		
		
		
		
		
		
		System.out.println("*********************");
		
		int msf = 28;
		int zjm = 23;
		String father = msf > zjm ? "我是你爸爸" : "张嘉敏熊孩子";
		System.out.println(father);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
