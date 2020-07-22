package cn.itcast.task.homework.test04;

import java.util.Scanner;

/*

分析如下需求, 并通过代码实现:
	1. 定义学生类Student, 属性和行为如下:
		属性:
			学员编号: 	    String id
			姓名: 	  	String name
			性别:		String gender
			身高:		double height
			年龄:		int age
		行为:
			学习: study()
			吃饭: eat()
	2. 在测试类StudentTest的main方法中, 完成如下功能:
		2.1 提示用户键盘录入学生的每一项信息, 然后接收.
		2.2 将接收到的信息, 存储到一个学生对象中.
		2.3 打印这个对象的各个属性值.
		2.4 通过该对象, 调用Student类中的成员方法study()和eat().
	4. 控制台输出结果格式如下:
		请录入学生的编号:
		...		//这里是用户录入的内容
		请录入学生的姓名:
		...
		请录入学生的性别:
		...
		请录入学生的身高:
		...
		请录入学生的年龄:
		...

		编号为222, 姓名为张三, 性别为男, 身高为175.3cm, 年龄为23岁的学生, 正在努力的敲代码, 学习JavaSE相关的知识点.
		学习饿了要吃饭.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = scanner.next();

        Student student = new Student();
        student.setName(name);
    }
}
