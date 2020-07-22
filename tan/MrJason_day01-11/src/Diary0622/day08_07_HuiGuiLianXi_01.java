package Diary0622;

public class day08_07_HuiGuiLianXi_01 {
	public static void main(String[] args) {
		int i = 0;
		for(int x = 1;x <= 100;x++){
			i = i + x;
//			System.out.println(i);//【可以打开试试】
		}
		System.out.println(i);
		
		
		for(int y = 1,m = 0;y <= 100 && m == 0;y++,m*= m){
			m = m + y;
			
		}
//		System.out.println(m);//【可以打开试试】
	}
}
