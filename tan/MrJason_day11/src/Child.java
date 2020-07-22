
public class Child {
	private String name;
	private int age;
	
//	调出get和set方法的步骤
//	1> alt + shift + s
//	2> 选择“Generate Getters and Setters....” 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//使用数据封装来限制年龄范围
	public void setAge(int age) {
		if(age <= 0 || age >= 150) {
			System.out.println("非法年龄");
			return;
		}
		this.age = age;
	}
	
	
}
