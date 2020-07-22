package Diary0620;

public class day07_07_switch_ {
	public static void main(String[] args) {
		//switch语句会在几个选项中做出选择
		int number = 6;
		if(number == 1){
			System.out.println("一");
		}else if(number == 2){
			System.out.println("二");
		}else if(number == 3){
			System.out.println("三");
		}else if(number == 4){
			System.out.println("四");
		}else if(number == 5){
			System.out.println("五");
		}else{
			System.out.println("number 不是12345");
		}
		System.out.println("**********");
		
		//switch会在几个选项中做出选择
		number = 3;
		switch(number){
		case 1 ://如果number是“1”，就执行下面的代码，break是终止，后面case和default都不看了
			System.out.println("一");
			break;
		case 2 :
			System.out.println("二");
			break;
		case 3 :
			if(number > 3)
			System.out.println("三");
			if(number > 1){
				System.out.println("2 > 1");
			}
			break;
		case 4 :
			System.out.println("四");
			break;
		case 5 :
			System.out.println("五");
			break;
		default ://如果上面的case都没有匹配成功，那么就会default会得到执行
			System.out.println("number 不是12345");
			break;	
		}
		System.out.println("**********");
		
		int x = 7;
		switch(x){
		case 7 :
			System.out.println("你好！");
			System.out.println("我是麻少飞");
			System.out.println("我知道是你召唤了我");
			break;
		}
		//switch语句只能使用char，byte，short，int，String和枚举
		//case必须是编译时的一个常量
		
		
	}
}
