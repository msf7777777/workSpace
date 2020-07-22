package cn.itcast.task.task03_CatAndDog;
/*
3. 已知猫和狗都有姓名和年龄, 且都有吃饭的方法,
   不同的吃: 猫吃鱼, 狗吃肉.
   它们都有跑步的方法, 而且仅仅是跑步.
   猫独有自己的抓老鼠(catchMouse)的功能,
   狗独有自己的看门(lookHome)的功能.
   请用所学, 模拟该知识.
 */
public abstract class Animal {
    //1.定义共同属性(名字&年龄)
    private String name;
    private int age;

    //2.定义抽象方法(吃饭)
    public abstract void eat();

    //3.定义方法(跑步)
    public void run(){
        System.out.println("我是小动物,我叫" + name + "我在切尔诺贝利跑步");
    }

    //4.构造无参&有参函数
    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //5.给属性提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
