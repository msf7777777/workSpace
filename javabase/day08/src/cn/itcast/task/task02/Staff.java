package cn.itcast.task.task02;
/*
二.
	1.请定义"员工(类)”：
	属性：姓名、性别、年龄(全部私有)
	行为：工作(抽象)
	无参、全参构造方法
	get/set方法
	2.请定义“绘画(接口)”
	抽象方法：绘画
	3.请定义“Java讲师类”继承自“员工类”
	4.请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。
	请按上述要求设计出类结构，并实现相关的方法，并进行调用测试。
 */
public abstract class Staff {
    //1.定义共同属性(名字&性别&年龄)
    private String name;
    private char gender;
    private int age;

    //2.定义抽象方法(工作)
    public abstract void work();

    //3.构造无参&有参函数
    public Staff() {
    }
    public Staff(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //4.给属性提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
