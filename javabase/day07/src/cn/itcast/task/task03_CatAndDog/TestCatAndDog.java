package cn.itcast.task.task03_CatAndDog;
/*
3. 已知猫和狗都有姓名和年龄, 且都有吃饭的方法,
   不同的吃: 猫吃鱼, 狗吃肉.
   它们都有跑步的方法, 而且仅仅是跑步.
   猫独有自己的抓老鼠(catchMouse)的功能,
   狗独有自己的看门(lookHome)的功能.
   请用所学, 模拟该知识.
 */
public class TestCatAndDog {
    public static void main(String[] args) {
        //1.创建Cat对象测试类中方法
        Cat cat = new Cat("Sam", 7);//参数代入方法创建Cat对象
        cat.setName("Tom");//set方法修改参数
        cat.eat();//Cat类继承父类抽象方法eat输出
        cat.catchMouse();//Cat类独有方法catchMouse输出

        //2.创建Dog对象测试类中方法
        Dog dog = new Dog();//无参方法创建Dog对象
        dog.setName("Fucker");//set方法设置参数name
        dog.setAge(2);//set方法设置参数age
        dog.eat();//Dog类继承父类抽象方法eat输出
        dog.fuckPeople();//Dog类独有方法fuckPeople输出
    }
}
