package No03_继承;

//java中通过继承一个类，来继承此类的所有功能。
//java中的每一个类都继承于Object类
//当创建一个类时，会自动的继承Object类的所有方法。
//java中所有类都继承于Object类
//类F继承于Object
class F{
	
}
public class day1204 {
	public static void main(String[] args) {
		//ctrl + shift + t打开一种类型
		//ctrl + o 打开类的列表信息(属性和方法)
		F f = new F();
		//toString方法继承于Object
		System.out.println(f.toString());//F作为字符串进行输出
		//hashCode方法继承于Object
		//hashCode方法是本地方法，没有方法体
		//native方法会调用底层的c语言的函数
		//hashCode方法将返回对象的哈希码
		System.out.println(f.hashCode());
		//instanceof关键字用于判断一个对象是否是这个类型
		//f是F类的实例
		System.out.println(f instanceof F);//true，小黑是哺乳动物
		//f是Object类的实例
		System.out.println(f instanceof Object);//true，小黑是动物
		//动物（Object）
		//哺乳动物（F），f是某一只具体的哺乳动物（我家的狗--小黑）
		//猴子
	}
}
