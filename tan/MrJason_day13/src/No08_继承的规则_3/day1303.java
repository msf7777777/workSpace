package No08_继承的规则_3;

//父类型的变量可以引用子类型的对象

import java.util.Date;

class Animal {
}
class Pet extends Animal {
}
class Dog extends Pet {
}

public class day1303 {
	public static void main(String[] args) {
		// 超类型的变量可以引用子类型的对象
		Animal a1 = new Pet();
		Animal a2 = new Dog();
		Pet a3 = new Dog();
		// 由于Object类是所有类的超类，因此Object类的变量可以引用任何类的实例
		Object o1 = new Animal();
		Object o2 = new String();
		Object o3 = new Date();
	}
}

//java中不支持多继承，即只能继承一个类。但是可以使用继承链
//class Dog extends Animal, Pet { //编译错误
//}
