package cn.itcast.task.task02_ManagerAndCoder;
/*
2. 定义项目经理类Manager和程序员类Coder, 他们都有姓名, 工号, 工资属性.
   项目经理额外有奖金(bonus)属性.
   他们都要吃饭, 睡觉, 工作. 不同的是, 工作内容不同. 请用所学, 模拟该知识.
 */
public abstract class Staff {
    //1.定义共同属性(姓名&工号&工资)
    private String name;
    private int id;
    private int salary;

    //2.定义方法(吃&睡)
    public void eat(){
        System.out.println("我是" + name + ",不管我是什么,我得吃饭");
    }
    public void sleep(){
        System.out.println(name + "是我,我无论职位高低,都得休息");
    }

    //3.定义抽象方法(工作)
    public abstract void work();

    //4.构造无参&有参函数
    public Staff() {
    }
    public Staff(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //5.给属性提供Getter and Setter方法
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
