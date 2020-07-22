package Diary0623;

import java.util.Scanner;

public class day09_01_print_08_ShengDanShu {
	public static void print(String x) {
		System.out.println("*************************");
		System.out.println("*" + "           " + x + "           " + "*\n"
						  +"*" + "          " + x + " " + x + "          " + "*\n"
				          +"*" + "         " + x + " " + x + " " + x + "         " + "*\n"
				          +"*" + "        " + x + " " + x + " " + x + " " + x + "        " + "*\n"
				          +"*" + "       " + x + " " + x + " " + x + " " + x + " " + x + "       " + "*\n"
				          +"*" + "      " + x + " " + x + " " + x + " " + x + " " + x + " " + x + "      " + "*\n"
				          +"*" + "     " + x + " " + x + " " + x + " " + x + " " + x + " " + x + " " + x + "     " + "*\n"
				          +"*" + "          " + x + " " + x + "          " + "*\n"
				          +"*" + "          " + x + " " + x + "          " + "*\n"
				          +"*" + "          " + x + " " + x + "          " + "*\n"
				          +"*" + "          " + x + " " + x + "          " + "*\n"
				          +"*" + "          " + x + " " + x + "          " + "*");
		System.out.println("*************************");	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("〓你好，朋友！我是来自暗网的琴痴〓");
		System.out.println("【圣诞节到了，祝你圣诞节快乐！！】");
		System.out.println("|●我有一棵圣诞树作为礼物送给你●|");
		System.out.println("|●并且你还可以自己描绘她的样子●|");
		System.out.println("〓下面请说出你希望你圣诞树的样子〓");
		System.out.println("************************");
		System.out.println(" ");
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
		System.out.println("№ 你希望它用什么图案拼接组成呢？ №");
		System.out.println("************************");
		
		String a = s.next();
		print(a);
		s.close();
	}
}
