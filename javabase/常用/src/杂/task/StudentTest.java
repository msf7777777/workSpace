package 杂.task;
/*
2. 在测试类StudentTest的main方法中, 完成如下功能:
		2.1 提示用户键盘录入学生的每一项信息, 然后接收.
		2.2 将接收到的信息, 存储到一个学生对象中.
		2.3 打印这个对象的各个属性值.
		2.4 通过该对象, 调用Student类中的成员方法study()和eat().
	4. 控制台输出结果格式如下:
		请录入学生的编号:
		...		//这里是用户录入的内容
		请录入学生的姓名\性别\身高\年龄
		...
		编号为222, 姓名为张三, 性别为男, 身高为175.3cm, 年龄为23岁的学生, 正在努力的敲代码, 学习JavaSE相关的知识点.
		学习饿了要吃饭.
 */

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //输入器
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你的工作:");
        String job = sc.next();
        System.out.println("请录入" + job + "的编号:");
        String id = sc.next();
        System.out.println("请录入" + job + "的姓名:");
        String name = sc.next();
        System.out.println("请录入" + job + "的性别:");
        String gender = sc.next();
        System.out.println("请录入" + job + "的身高:");
        double height = sc.nextDouble();
        System.out.println("请录入" + job + "的年龄:");
        double age = sc.nextDouble();
        System.out.println("请问此" + job + "现在在做什么?");
        String study = sc.next();

        Student student = new Student(job, id, name, gender, height, age);

        System.out.println("----------------------------------------------------------");
        System.out.print(" 编号为" + student.getId());
        System.out.print(",姓名为" + student.getName());
        System.out.print(",性别为" + student.getGender());
        System.out.print(",身高为" + student.getHeight());
        System.out.print(",年龄为" + student.getAge());
        System.out.println("的" + student.getJob());
        student.study(study);
        System.out.print(study);
        student.eat();
        System.out.println("----------------------------------------------------------");
    }
}
