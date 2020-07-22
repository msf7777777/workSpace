package cn.itcast.task;
/*
5. 定义程序员类Coder, 属性和行为如下, 并在测试类CoderTest中, 创建程序员类的对象, 然后访问类中的成员.
	属性：
		姓名: name
		工号: id
		工资: salary
	行为：
		工作: work()
		要求: 在测试类的main方法中, 要分别通过setXxx()和构造方法的方式, 给对象的属性赋值.
		    控制台输出结果格式如下: 	//属性值可以自定义, 但是必须是下述的格式.
			set方法: 工号为222, 基本工资为10000的程序员张三正在努力的写着代码.....
			构造方法:工号为333, 基本工资为15000的程序员王五正在努力的写着代码.....
 */
public class CoderTest {
    public static void main(String[] args) {
        Coder coderZ = new Coder();
        coderZ.setName("张三");
        coderZ.setId(222);
        coderZ.setSalary(10000);
        System.out.print("工号为" + coderZ.getId() + ",基本工资为" + coderZ.getSalary() + "的程序员" + coderZ.getName());
        coderZ.work();

        Coder coderW = new Coder("王五", 333, 15000);
        System.out.print("工号为" + coderW.getId() + ",基本工资为" + coderW.getSalary() + "的程序员" + coderW.getName());
        coderW.work();

    }
}
