package Diary0619;

public class day06_11_SanYuanYunSuanFu {
	public static void main(String[] args) {
		//表达式为true取:之前的，为false取之后的
		int age = 18;
		System.out.println(age >= 18 ? "成年了-来了老弟？" : "未成年");
		
		age = 17;
		System.out.println(age >= 18 ? "成年了" : "未成年-滾出去！");
		
		String fucker = age >= 18 ? "成年了" : "未成年-草你妈！又是你？";
		System.out.println(fucker);
		
		System.out.println("*********************");
		
		int a = 1000;
		System.out.println(1000 / 60);//【16】
		System.out.println(1000 % 60);//【40】
		
		
		
		
		
		
		
		
		
		System.out.println("*********************");
		
		System.out.println("我是谁？我在哪里？");
		int x = 1000;
		String minute = "分钟";
		String hour = "小时";
		
		System.out.println(1000 / 60 + hour + (1000 % 60) + minute );
		System.out.println(1000 / 60 + hour + " " + (1000 % 60) + minute );
		System.out.println(1000 / 60 + "小時" + (1000 % 60) + "分鐘" );
		System.out.println("*******");
		
		System.out.println(x / 60 + hour + " " + x % 60 + minute);
		
		String time = x / 60 + hour + " " + x % 60 + minute;
		
		System.out.println(minute);
		System.out.println(hour);
		System.out.println(time);//【16小时 40分钟】”时“和”4“的中间有一个空格
		
		System.out.println("*********************");
		
		
		
		
		int r = 5;// radius 半径是5
		double π = 3.141592653;
		String m = "米";
		System.out.println(2 * π * r + m);
		String p = 2 * π * r + m;
		System.out.println(p);
//		String p = 2 * π * r;//编译错误  光是数字Spring不可编译，后面必须加“+ m”   这里不懂
		
		String square = "平方米";
		System.out.println(π * r * r + square);
		//String MianJi = π * r * r + square;
		System.out.println("*********************");
		
		
		
		
		int msf = 28;//msf 是 麻少飞
		int zjm = 23;//zjm 是 张嘉敏
		System.out.println(msf > zjm ? "麻少飞 比 张嘉敏 年龄大" : "放屁！张嘉敏年龄大");
		String father = msf > zjm ? "麻少飞 比 张嘉敏 年龄大" : "放屁！张嘉敏年龄大";
		System.out.println(father);
		
		zjm = 32;
		System.out.println(msf > zjm ? "麻少飞 比 张嘉敏 年龄大" : "放屁！张嘉敏年龄大");
		String mother = msf > zjm ? "麻少飞 比 张嘉敏 年龄大" : "放屁！张嘉敏年龄大";
		System.out.println(mother);
		
		String A = ""+5;//“A不是数字”
		System.out.println(A);
//		System.out.println(A == 5 ? "是的" : "不是");// 编译错误，“A不是数字”
		int i = 5;
		
		
		
		
	}
}
