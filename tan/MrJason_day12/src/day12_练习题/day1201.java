package day12_练习题;
//定义一个Person类（name，age，sno）进行数据封装，age的年龄范围设置为0-130，使用getAge返回年龄。
public class day1201 {
	public static void main(String[] args) {
		Person p = new Person("张嘉敏", 23, 19960122);
		
		System.out.println("----------【1】----------");
		System.out.println(p.getName());//【张嘉敏】
		System.out.println(p.getAge());//【23】
		System.out.println(p.getSno());//【19960122】
		
		System.out.println("----------【2】----------");
		p.setAge(-1);//【非法年龄数据】
		System.out.println(p.getAge());//【23】
		
		System.out.println("----------【3】----------");
		p.setName("麻少飞");
		p.setAge(28);
		p.setSno(19901113);
		System.out.println(p.getName());//【麻少飞】
		System.out.println(p.getAge());//【28】
		System.out.println(p.getSno());//【19901113】
		
	}
	
}
