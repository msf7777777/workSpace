package cn.itcast.task.task06_CoderAndManager;
/*
6.分析以下需求并实现

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
public class Coder extends Staff {
    //构造无参&有参函数
    public Coder() {
    }
    public Coder(String name, int id, int salary) {
        super(name, id, salary);
    }
}
