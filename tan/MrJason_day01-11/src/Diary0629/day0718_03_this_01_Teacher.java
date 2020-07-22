package Diary0629;

public class day0718_03_this_01_Teacher {
	//没一个实例方法和构造器都有一个隐式参数this
	//在实例方法中，this代表调用此方法的对象
	//在构造器中this代表当前被创建的对象
	public static void main(String[] args) {
		Teacher t1 = new Teacher("麻少飞",28);
		System.out.println(t1);
		t1.setName("张嘉敏");
		System.out.println(t1.name);//【张嘉敏】
		t1.setAge(23);
		System.out.println(t1.age);//【23】
		
		System.out.println(t1);
	}
}
 