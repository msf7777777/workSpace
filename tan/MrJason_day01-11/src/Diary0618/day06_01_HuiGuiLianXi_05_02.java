package Diary0618;

import java.util.Scanner;

public class day06_01_HuiGuiLianXi_05_02 {
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("〓你好，朋友！我是来自暗网的琴痴〓");
		System.out.println("【圣诞节到了，祝你圣诞节快乐！！】");
		System.out.println("|●我有一棵圣诞树作为礼物送给你●|");
		System.out.println("|●并且你还可以自己描绘她的样子●|");
		System.out.println("〓下面请说出你希望你圣诞树的样子〓");
		System.out.println("************************");
		System.out.println(" ");
		
		Scanner s = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("*           *          *\n"
				          +"*          * *         *\n"
				          +"*         * * *        *\n"
				          +"*        * * * *       *\n"
				          +"*       * * * * *      *\n"
				          +"*      * * * * * *     *\n"
				          +"*     * * * * * * *    *\n"
				          +"*          * *         *\n"
				          +"*          * *         *\n"
				          +"*          * *         *\n"
				          +"*          * *         *\n"
				          +"*          * *         *");
		System.out.println("************************");
		System.out.println(" ");
		System.out.println("************************");
		System.out.println("№ 最高12层，你希望他是多少层？ №");
		System.out.println("************************");
		int a = s.nextInt();
		System.out.println("************************");
		System.out.println("№ 你希望它用什么图案拼接组成呢？ №");
		System.out.println("************************");
		String b = s.next();
		System.out.println("************************");
		System.out.println("№ 你希望它的左边用什么语言修饰？ №");
		System.out.println("************************");
		String c = s.next();
		System.out.println("************************");
		System.out.println("№ 你希望它的右边用什么语言修饰？ №");
		System.out.println("************************");
		String d = s.next();
		
		if(a < 13 && a > 3){
			//三角图的编译
			int kg = a - 1;//三角图第一行空格的数
			for(int x = 1;x <= a;x++){//三角图的行数
				System.out.print("(" + c + ")" + "    ");
				//三角图每行之前的空格
				for(int y = 1;y <= kg;y++){//三角图每行之前的空格
					System.out.print(" ");
				}
				//三角图每行的“*”的个数
				for(int z = 1;z <= a - kg  ;z++){//三角图每行的“*”的个数
					System.out.print(b);
					System.out.print(" ");//每两个“*”之间都会有一个空格
				}
				for(int y = 1;y <= kg;y++){//三角图每行之前的空格
					System.out.print(" ");
				}
				System.out.println("   " + "(" + d + ")");
				System.out.println("");
				kg--;
			}
			
			//矩形图的编译
			for(int m = 1;m <= a - 2;m++){//矩形图的行数
				System.out.print("(" + c + ")" + "    ");
				//矩形图每行之前的空格
				for(int n = 1;n <= a - 2;n++){//矩形图每行之前的空格
					System.out.print(" ");
				}
				System.out.print(b + " " + b);
				for(int n = 1;n <= a - 2;n++){//矩形图每行之前的空格
					System.out.print(" ");
				}
				System.out.println("    " + "(" + d + ")");
				System.out.println(" ");
			}
		}else if (a > 13){
			System.out.println("※※※※※※※※  警  告  ※※※※※※※※");
			System.out.println("※我就知道 你是个贪得无厌的小家伙※");
			System.out.println("※我保证，在某一天 你一定会倒霉的※");
			System.out.println("※※※※※※ Fuck off！※※※※※※");
			System.out.println("※※※※※※※※※Exit※※※※※※※※");
		}else if(a == 13){
			System.out.println("※※※※※※※※  警  告  ※※※※※※※※");
			System.out.println("※  13 不是什么吉利的数字  请停止※");
			System.out.println("※※※※※※※※※Exit※※※※※※※※");
		}else if(a <= 3){
			System.out.println("※※※※※※※※  提  示  ※※※※※※※※");
			System.out.println("※还好你没像其他人那么的疯狂BUT※");
			System.out.println("※不得不说 你就是一个没脑子的东西※");
			System.out.println("※※※※※※※※※Exit※※※※※※※※");
		}
		
		
		
		
		
		
		
		
		
	}
}
