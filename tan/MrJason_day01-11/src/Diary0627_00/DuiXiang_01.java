package Diary0627_00;

public class DuiXiang_01 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "小狗1";
		d1.age = 10;
		d1.color = "灰色";
		d1.type = "哈士奇";
		
		Dog d2 = new Dog();
		d2.name = "小狗2";
		d2.age = 11;
		d2.color = "白色";
		d2.type = "萨摩耶";
		
		Dog d3 = new Dog();
		d3.name = "小狗3";
		d3.age = 12;
		d3.color = "灰色";
		d3.type = "中华田园犬";
		
		System.out.println(d1.name);
		System.out.println(d2.age);
		System.out.println(d3.type);
	}
}
