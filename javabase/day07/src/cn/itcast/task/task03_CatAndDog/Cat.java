package cn.itcast.task.task03_CatAndDog;
/*
3. 已知猫和狗都有姓名和年龄, 且都有吃饭的方法,
   不同的吃: 猫吃鱼, 狗吃肉.
   它们都有跑步的方法, 而且仅仅是跑步.
   猫独有自己的抓老鼠(catchMouse)的功能,
   狗独有自己的看门(lookHome)的功能.
   请用所学, 模拟该知识.
 */
public class Cat extends Animal {
    //1.继承父类抽象方法并定义
    @Override
    public void eat() {
        System.out.println("我是猫,吃鱼.我叫" + getName() + "," + getAge() + "岁");
    }

    //2.定义独有方法(catchMouse)
    public void catchMouse(){
        System.out.println("我有抓老鼠的功能");
    }

    //3.构造无参&有参函数
    public Cat() {
    }
    public Cat(String name, int age) {
        super(name, age);
    }
}
