package Diary0629;

public class day0718_03_this_02_Teacher2 {
	//没一个实例方法和构造器都有一个隐式参数this
	//在实例方法中，this代表调用此方法的对象
	//在构造器中this代表当前被创建的对象
	public static void main(String[] args) {
		Teacher2 t1 = new Teacher2();
		t1.set("张嘉敏",23);
		System.out.println(t1.name + t1.age + "周岁");//【张嘉敏0周岁】
		
		System.out.println(t1);
	}
}
