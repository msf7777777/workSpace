package Diary0629;//指示这个类位于“Diary0629”包下，注意与实际文件的层次匹配

//import Diary0629_a.Foo;
import Diary0629_a.*;

public class day0718_04_BaoAndDaoRu_02 {
	//在项目开发中类的名字必须是唯一的。
	//可以使用包来把类组织起来。
	//包类似于文件夹，把类放在不同包下，就可以避免命名冲突。
	//java标准库中有很多包，这些包都是按照功能来划分的。
	//“java.lang”包，包括了java中最基础的类，是不需要导入的
	//“java.util”包，包括了java工具类
	//“java.net”包，包括了java网络相关的类
	//“Arrays”类位于“java.util”包中，那么它的全名就是“java.util.Arrays”
	public static void main(String[] args) {
		Foo f = new Foo();
		Math.max(1,2);
//		f.say = "朕乃麻少飞";
//		f.name = "麻少飞";
		System.out.println(f);
		
		Person p1 = new Person();
		p1.name = "麻志强";
		System.out.println(p1.name);
		
	}
	
	
}
