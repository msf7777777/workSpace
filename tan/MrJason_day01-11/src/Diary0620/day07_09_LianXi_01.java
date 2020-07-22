package Diary0620;

public class day07_09_LianXi_01 {
	public static void main(String[] args) {
		//java.util.Scanner是一个类，它是一个扫描器
		//System.in代表标准输入流，就是从控制台来获取输入
		//new是一个操作符，用来创建一个扫描器对象
		//s代表了刚创建的扫描器
		java.util.Scanner s = new java.util.Scanner(System.in);
		int score = s.nextInt();//会等待键盘输入一个int数据，将输入结果赋值给score
		if(score <=100 && score >= 0){
			if(score >= 60){
				System.out.println("及格");
			}else{
				System.out.println("不及格");
			}
		}
//		s.close();//关闭扫描器
//		System.out.println("**********");
		
		int c = s.nextInt();
		System.out.println(c);
		s.close();
		
		String msf = "我是麻少飞";
		System.out.println(msf);
		s.close();
		
		
		
	}
}
