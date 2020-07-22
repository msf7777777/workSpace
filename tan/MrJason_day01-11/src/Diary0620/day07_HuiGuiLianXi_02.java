package Diary0620;

import java.util.Scanner;

public class day07_HuiGuiLianXi_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("«Î ‰»Î_x = £®£©");
		int a = s.nextInt();
		System.out.println("«Î ‰»Î_y = £®£©");
		int b = s.nextInt();
		System.out.println("«Î ‰»Î_z = £®£©");
		int c = s.nextInt();
		
		int x = 1,y = 1,z = 1;
		while(x <= a){
			y = 1;
			while(y <= b){
				while(z <= c){
					System.out.println(x + "" + y + "" + z);
					z++;
				}
				z = 1;
				y++;
			}
			x++;
		}
		
		
		System.out.println("");
		System.out.println("***************");
		System.out.println("");
		
		System.out.println("x" + " = " + x);
		System.out.println("y" + " = " + y);
		System.out.println("z" + " = " + z);

		
		
		
		
		
		
		
		

		s.close();
	}
}
