package cn.itcast.task.task02_ManagerAndCoder;
/*
2. 定义项目经理类Manager和程序员类Coder, 他们都有姓名, 工号, 工资属性.
   项目经理额外有奖金(bonus)属性.
   他们都要吃饭, 睡觉, 工作. 不同的是, 工作内容不同. 请用所学, 模拟该知识.
 */
public class Coder extends Staff {
    //1.继承父类抽象方法并定义
    @Override
    public void work() {
        System.out.println("我是程序员,名字" + getName() + "我在写代码");
    }

    //2.构造无参&有参函数
    public Coder() {
    }
    public Coder(String name, int id, int salary) {
        super(name, id, salary);
    }
}
