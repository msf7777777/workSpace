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
public interface Painting {
    //定义一个抽象方法(绘画)
    public abstract void painting();
}
