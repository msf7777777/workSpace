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
		System.out.println("����ã����ѣ��������԰������ٳա�");
		System.out.println("��ʥ���ڵ��ˣ�ף��ʥ���ڿ��֣�����");
		System.out.println("|������һ��ʥ������Ϊ�����͸����|");
		System.out.println("|�����㻹�����Լ�����������ӡ�|");
		System.out.println("��������˵����ϣ����ʥ���������ӡ�");
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
		System.out.println("�� ��ϣ������ʲôͼ��ƴ������أ� ��");
		System.out.println("************************");
		
		String a = s.next();
		print(a);
		s.close();
	}
}
