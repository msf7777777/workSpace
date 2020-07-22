package cn.itcast.task.task02_ManagerAndCoder;
/*
2. 定义项目经理类Manager和程序员类Coder, 他们都有姓名, 工号, 工资属性.
   项目经理额外有奖金(bonus)属性.
   他们都要吃饭, 睡觉, 工作. 不同的是, 工作内容不同. 请用所学, 模拟该知识.
 */
public class Manager extends Staff {
    //1.继承父类抽象方法并定义
    @Override
    public void work() {
        System.out.println("我是经理,工号" + getId() + "我管理程序员");
    }

    //2.定义经理特有属性(奖金)
    private int bonus;

    //3.构造无参&有参函数
    public Manager() {
    }
    public Manager(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    //4.提供Getter and Setter方法
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
