package Diary0618;

import java.util.Scanner;

public class day06_01_HuiGuiLianXi_05_02 {
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("����ã����ѣ��������԰������ٳա�");
		System.out.println("��ʥ���ڵ��ˣ�ף��ʥ���ڿ��֣�����");
		System.out.println("|������һ��ʥ������Ϊ�����͸����|");
		System.out.println("|�����㻹�����Լ�����������ӡ�|");
		System.out.println("��������˵����ϣ����ʥ���������ӡ�");
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
		System.out.println("�� ���12�㣬��ϣ�����Ƕ��ٲ㣿 ��");
		System.out.println("************************");
		int a = s.nextInt();
		System.out.println("************************");
		System.out.println("�� ��ϣ������ʲôͼ��ƴ������أ� ��");
		System.out.println("************************");
		String b = s.next();
		System.out.println("************************");
		System.out.println("�� ��ϣ�����������ʲô�������Σ� ��");
		System.out.println("************************");
		String c = s.next();
		System.out.println("************************");
		System.out.println("�� ��ϣ�������ұ���ʲô�������Σ� ��");
		System.out.println("************************");
		String d = s.next();
		
		if(a < 13 && a > 3){
			//����ͼ�ı���
			int kg = a - 1;//����ͼ��һ�пո����
			for(int x = 1;x <= a;x++){//����ͼ������
				System.out.print("(" + c + ")" + "    ");
				//����ͼÿ��֮ǰ�Ŀո�
				for(int y = 1;y <= kg;y++){//����ͼÿ��֮ǰ�Ŀո�
					System.out.print(" ");
				}
				//����ͼÿ�еġ�*���ĸ���
				for(int z = 1;z <= a - kg  ;z++){//����ͼÿ�еġ�*���ĸ���
					System.out.print(b);
					System.out.print(" ");//ÿ������*��֮�䶼����һ���ո�
				}
				for(int y = 1;y <= kg;y++){//����ͼÿ��֮ǰ�Ŀո�
					System.out.print(" ");
				}
				System.out.println("   " + "(" + d + ")");
				System.out.println("");
				kg--;
			}
			
			//����ͼ�ı���
			for(int m = 1;m <= a - 2;m++){//����ͼ������
				System.out.print("(" + c + ")" + "    ");
				//����ͼÿ��֮ǰ�Ŀո�
				for(int n = 1;n <= a - 2;n++){//����ͼÿ��֮ǰ�Ŀո�
					System.out.print(" ");
				}
				System.out.print(b + " " + b);
				for(int n = 1;n <= a - 2;n++){//����ͼÿ��֮ǰ�Ŀո�
					System.out.print(" ");
				}
				System.out.println("    " + "(" + d + ")");
				System.out.println(" ");
			}
		}else if (a > 13){
			System.out.println("����������������  ��  ��  ����������������");
			System.out.println("���Ҿ�֪�� ���Ǹ�̰�������С�һ��");
			System.out.println("���ұ�֤����ĳһ�� ��һ���ᵹù�ġ�");
			System.out.println("������������ Fuck off��������������");
			System.out.println("������������������Exit����������������");
		}else if(a == 13){
			System.out.println("����������������  ��  ��  ����������������");
			System.out.println("��  13 ����ʲô����������  ��ֹͣ��");
			System.out.println("������������������Exit����������������");
		}else if(a <= 3){
			System.out.println("����������������  ��  ʾ  ����������������");
			System.out.println("��������û����������ô�ķ��BUT��");
			System.out.println("�����ò�˵ �����һ��û���ӵĶ�����");
			System.out.println("������������������Exit����������������");
		}
		
		
		
		
		
		
		
		
		
	}
}
