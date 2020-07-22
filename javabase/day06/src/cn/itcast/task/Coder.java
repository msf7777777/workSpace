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
public class Coder {
    //构造函数
    public Coder() {
    }

    //属性
    private String name;
    private int id;
    private int salary;

    //行为1
    public void work(){
        System.out.println("正在努力的写着代码");
    }

    //有参函数
    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
