package Diary0620;

public class day07_06_if_QianTao_if_1 {
	public static void main(String[] args) {
		//嵌套的if
		int a = 1001;//考试成绩
		if(a >= 60 & a <= 100){
			//通过了
			if(a >= 90){
				System.out.println("优秀");
			}else if(a >= 80){//a < 90 && a >= 80
				System.out.println("良好");
			}else{//a < 80 && a >= 60
				System.out.println("成绩一般");
			}
		}else if(a < 60 & a >= 0){
			System.out.println("挂科");
		}else if(a < 0){
			System.out.println("傻逼吧你");
		}else if(a > 100 & a <= 1000){
			System.out.println("你还是人类吗？");
		}else{
			System.out.println("超越神啦！");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
