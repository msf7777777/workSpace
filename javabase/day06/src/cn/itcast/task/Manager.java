package cn.itcast.task;
/*
4. 定义项目经理类Manager, 属性和行为如下, 并在测试类ManagerTest中, 创建项目经理类的对象, 然后访问类中的成员.
	属性：
		姓名: name
		工号: id
		工资: salary
		奖金: bonus
	行为：
		工作: work()
		要求: 在测试类的main方法中, 要分别通过setXxx()和构造方法的方式, 给对象的属性赋值.
		    控制台输出结果格式如下: 	//属性值可以自定义, 但是必须是下述的格式.
			set方法: 工号为123, 基本工资为15000, 奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
			构造方法:工号为666, 基本工资为20000, 奖金为1000的项目经理王五正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 */
public class Manager {
    //构造函数
    public Manager() {
    }

    //属性
    private String name;
    private int id;
    private int salary;
    private int bonus;
    //行为1
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }

    //有参函数
    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
