
package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_02 {
	public static void main(String[] args) {
		//ctrl + shift + o ������
		System.out.println("�����ǰ��մ�С�����������������������������");
		Scanner s = new Scanner(System.in);
		System.out.println("������num1");
		int num1 = s.nextInt();
		System.out.println("������num2");
		int num2 = s.nextInt();
		System.out.println("������num3");
		int num3 = s.nextInt();
		
		int x;
		if(num1 > num2){
			x = num1;
			num1 = num2;
			num2 = x;
		}//num1 < num2
		
		if(num2 > num3){
			x = num2;
			num2 = num3;
			num3 = x;
		}//num2 < num3
		
		if(num1 > num2){
			x = num1;
			num1 = num2;
			num2 = x;
		}//num1 < num2
		
		System.out.println("�𰸳����ˣ��뿴����");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		s.close();
	}
}
