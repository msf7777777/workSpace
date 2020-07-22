package Diary0619;

public class day06_10_DuanLu {
	public static void main(String[] args) {
		//短路与操作符 &&，只要一边是false就是false。
		System.out.println(true && true);//【true】
		System.out.println(true && false);//【false】
		System.out.println(false && true);//【false】
		System.out.println(false && false);//【false】
		
		System.out.println(1 < 2 && 2 < 3);//【true】
		System.out.println(1 < 2 && 2 > 3);//【false】
		
		int a = 1;
		int b = 2;
		System.out.println(a < b);//【true】
		
		int c = 3;
		short d = 4;
		System.out.println(c > d);//【false】
		
		System.out.println("**********************");
		
		//短路或操作符 ||，只要一边是true就是true。
		System.out.println(true || true);//【true】
		System.out.println(true || false);//【true】
		System.out.println(false || true);//【true】
		System.out.println(false || false);//【false】
		
		System.out.println(1 < 2 || 2 < 3);//【true】
		System.out.println(1 < 2 || 2 > 3);//【true】
		System.out.println(1 > 2 || 2 > 3);//【false】
		
		System.out.println("**********************");
		
		//短路是指，当结果已经明确了，就不必要往下执行了。
		int x = 10;
		System.out.println(true && ++x == 11);//【true】后面的”++x == 11“是执行的！！！
		System.out.println(x);//【11】
		System.out.println(++x == 11 && true);//【false】
		System.out.println(x);//【12】
		
		System.out.println("**********************");
		
		int y = 10;
		System.out.println(true || ++y == 11);//【true】
		System.out.println(y);//【10】
		System.out.println(++y == 12 || ++y == 12);//【true】
		System.out.println(y);//【12】
		
		System.out.println("**********************");
		
		int z = 10;
		System.out.println(true | ++z == 12);
		System.out.println(z);//【11】
		System.out.println(true & ++z == 12);
		System.out.println(z);//【12】
		
		System.out.println("**********************");
		
		//&&和|| 执行一边就能出结果，而&和| 两边都执行；为了节省效率，所以选择&&和||
		
		System.out.println(true & true);//【true】
		System.out.println(true & false);//【false】
		System.out.println(false & true);//【false】
		System.out.println(false & false);//【false】
		
		System.out.println(true | true);//【true】
		System.out.println(true | false);//【true】
		System.out.println(false | true);//【true】
		System.out.println(false | false);//【false】
		
		System.out.println("**********************");
		
		//异或^，当两边结果不同时是true，相同时是false,两边都执行
		System.out.println(true ^ true);//【false】
		System.out.println(true ^ false);//【true】
		System.out.println(false ^ true);//【true】
		System.out.println(false ^ false);//【false】
		
		System.out.println("**********************");
		
		//非！，取反
		System.out.println(!false);//【true】
		System.out.println(!true);//【false】
//		System.out.println(!a < b);// 编译错误，对于参数类型int未定义
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
