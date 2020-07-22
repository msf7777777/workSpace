package Diary0627;

public class day0715_02_LeiAndDuiXiang {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "张三";
		p1.age = 10;
		p1.gender = '男';
		p1.sno = 20191101;
		
		Person p2 = new Person();
		p2.name = "李四";
		p2.age = 11;
		p2.gender = '女';
		p2.sno = 20191102;
		
		//p1和p2类型相同，但是数据互相独立
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.sno);
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		System.out.println(p2.sno);
	}
}
