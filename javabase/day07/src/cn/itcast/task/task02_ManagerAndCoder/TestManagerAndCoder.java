package cn.itcast.task.task02_ManagerAndCoder;
/*
2. 定义项目经理类Manager和程序员类Coder, 他们都有姓名, 工号, 工资属性.
   项目经理额外有奖金(bonus)属性.
   他们都要吃饭, 睡觉, 工作. 不同的是, 工作内容不同. 请用所学, 模拟该知识.
 */
public class TestManagerAndCoder {
    public static void main(String[] args) {
        //1.创建Coder对象测试类中方法
        Coder coder = new Coder("麻少飞", 901113, 20000);//参数代入方法创建Coder对象
        coder.setId(901113);//set方法更改参数id
        coder.eat();//Coder类继承父类方法eat输出
        coder.sleep();//Coder类继承父类方法sleep输出
        coder.work();//Coder类继承父类抽象方法work输出

        //2.创建Manager对象测试类中方法
        Manager manager = new Manager();//无参方法创建Teacher对象
        manager.setName("麻经理");//set方法设置参数
        manager.setId(630828);//set方法设置参数id
        manager.setSalary(88888888);//set方法设置参数salary
        manager.setBonus(10);//set方法设置参数bonus
        manager.eat();//Manager类继承父类方法eat输出
        manager.sleep();//Manager类继承父类方法sleep输出
        manager.work();//Manager类继承父类抽象方法work输出

    }
}
