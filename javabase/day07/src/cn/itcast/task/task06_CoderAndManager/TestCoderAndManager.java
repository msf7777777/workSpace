package cn.itcast.task.task06_CoderAndManager;
/*
6.分析以下需求并实现
	1.项目经理类Manager
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
	2.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
	要求:
		1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，
		    setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值
		    (演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			工号为 123 基本工资为 15000 奖金为 6000的 项目经理
			    正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
			工号为 135 基本工资为 10000 的 程序员
			    正在努力的写着代码......
 */
public class TestCoderAndManager {
    public static void main(String[] args) {
        //1.创建Coder对象测试类中方法
        Coder coder = new Coder("麻少飞", 901113, 20000);//参数代入方法创建Coder对象
        //调用成员方法,输出coder基本情况
        System.out.println("工号为" + coder.getId()//输出coder的id
                         + "基本工资为" + coder.getSalary()//输出coder的salary
                         + "的程序员" + coder.getName()//输出coder的name
                         + coder.work("正在努力的写着代码......"));//输出coder的具体工作

        //2.创建Manager对象测试类中方法
        Manager manager = new Manager();
        manager.setName("麻经理");
        manager.setId(630828);
        manager.setSalary(88888888);
        manager.setBonus(10);
        //调用成员方法,输出Manager基本情况
        System.out.println("工号为" + manager.getId()//输出manager的id
                         + "基本工资为" + manager.getSalary()//输出manager的salary
                         + "奖金为" + manager.getBonus()//输出manager的bonus
                         + "的项目经理" + manager.getName()//输出manager的name
                         + manager.work("正在努力的做着管理工作,分配任务,检查员工提交上来的代码....."));//输出coder的具体工作
    }
}
