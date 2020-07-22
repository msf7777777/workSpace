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
public class UILecturer extends Staff implements Painting {
    //1.重写从唯一一个接口继承来的抽象方法Painting
    @Override
    public void painting() {
        System.out.println("UI讲师要定期提升自己的绘画水平");
    }

    //2.重写从父类继承来的抽象方法work
    @Override
    public void work() {
        System.out.println(getAge()+ "岁,性别" + getGender() + "的UI讲师" + getName() + "的工作是教授UI知识");
    }

    //3.构造无参&有参函数
    public UILecturer() {
    }
    public UILecturer(String name, char gender, int age) {
        super(name, gender, age);
    }
}
