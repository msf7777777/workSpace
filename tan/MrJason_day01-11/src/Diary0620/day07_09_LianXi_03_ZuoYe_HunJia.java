package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_03_ZuoYe_HunJia {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������_��ߣ�CM��");
		int high = s.nextInt();
		System.out.println("������_��Ǯ��RMB��");
		int money = s.nextInt();//����Ӧ���ǣ�  long money = s.nextlong();  //
		System.out.println("������_������0-100�֣�");
		int face = s.nextInt();
		
		if(high >= 180 && high <= 200){
		//��	
			if(money >= 100000000 && money <= 999999999){
			//��&��Ǯ	
				if(face >= 80){
				//��&��Ǯ&����ֵ	
					System.out.println("��һ��Ҫ�޸���");
				}else if(face < 80 && face >= 60){
				//��&��Ǯ&���ѿ�	
					System.out.println("���Ұɣ����ϲ��㣬�������࣬�����徻�����տ�");
				}else if(face < 60 && face > 0){
				//��&��Ǯ&���ѿ�	
					System.out.println("�ްɣ����ϲ��㣬�������࣬û����Ҧ�����ͼ޸���Ǯ�ɣ�");
				}	
			}else if(money > 999999999){
			//��&����Ǯ����û��Ǯ��֪����	
				if(face >= 80 && face <= 100){
				//��&����Ǯ&����ֵ
					System.out.println("������ģ�����ģ���ô�����ܻ𳵣�");
				}else if(face < 80 && face >= 0){
				//��&����Ǯ&û��ֵ	
					System.out.println("�����贵ţ�ƣ��ݣ�������Լ���ɶ������ɵ�����");	
				}
			}else if(money < 100000000 && money >= 100){
				//��&Ǯ����&��ֵ������
				if(face <= 100 && face >= 0)
				System.out.println("���Ұɣ����ϲ��㣬�������࣬�����徻����̰�ƣ�������ʲô�����ţ�");
			}else if(money < 100){
			//��&���	
				if(face >=80 && face <= 100){
				//��&���&����ֵ
				System.out.println("С��ñ��100�鶼�����ң��Ҿ͵���Ѽ���ˣ���ù");
				}else if(face < 80 && face >= 0){
				//��&���&û��ֵ
					System.out.println("С��ñ��100�鶼�����ң���֪������͹ص�����");
				}
			}	
		}else if(high < 180 && high > 0){
		//����	
			if(money >= 100000000){
			//����&��Ǯ
				if(face >=80 && face <= 100){
				//����&��Ǯ&����ֵ
					System.out.println("��ã���������������������ӣ�");
				}else if(face < 80 && face > 0){
				//����&��Ǯ&û��ֵ
					System.out.println("Hey���˳���������ϱ�������ɣ�Ȣ��Ŷ");
				}
			}else if(money < 100000000){
			//����&ûǮ
				if(face >=80 && face < 100){
				//����&ûǮ&����ֵ
					System.out.println("�ֵܣ��ȴ�����׬Ǯ�ɣ�������Ь������������~");
				}else if(face < 80){
				//����&ûǮ&û��ֵ
					System.out.println("����");
				}
			}	
		}else if(high <= 0){
			if(money <= 0 && face <= 0){
				System.out.println("");
				System.out.println("......");
				System.out.println("������Ļ�û�ܾ��ɣ�ɵ�ƣ�");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("ɵ�Ʋ�������ֳ���");
		System.out.println("");
		System.out.println("�ٳ������ү������");
		
		s.close();
		
		
	}
}
