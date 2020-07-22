package Diary0620;

import java.util.Scanner;

public class day07_HuiGuiLianXi_01 {
	public static void main(String[] args) {
		System.out.println("你好！这里是暗网");
		System.out.println("下面请开始书写你的色情小说吧");
		System.out.println("请填写以下内容，我们将会自动生成");
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入_共有（）卷");
		int a = s.nextInt();
		System.out.println("请输入_共有（）章");
		int b = s.nextInt();
		System.out.println("请输入_共有（）节");
		int c = s.nextInt();
		System.out.println("你好！这里是”18天空“色情网站");
		System.out.println("我们的网站共有  " + a + "卷" + b + "章" + c + "节  的内容");
		for(int x = 1;x <= a;x++){//设定我们的黄色小说有多少 卷
			for(int y = 1;y <= b;y++){//设定我们的黄色小说有多少 章
				for(int z = 1;z <= c;z++){//设定我们的黄色小说有多少 节
					System.out.println("第" + x + "卷  " + "第" + y + "章  " + "第" + z + "节");
				}
			}
		}
		
		
		
		
		
		
		
		s.close();
	}
}
