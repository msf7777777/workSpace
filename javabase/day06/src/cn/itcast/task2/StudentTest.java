package cn.itcast.task2;
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
        System.out.println("请录入学生的编号:");
        String id = sc.next();
        System.out.println("请录入学生的姓名:");
        String name = sc.next();
        System.out.println("请录入学生的性别:");
        String gender = sc.next();
        System.out.println("请录入学生的身高:");
        double height = sc.nextDouble();
        System.out.println("请录入学生的年龄:");
        int age = sc.nextInt();

        Student student = new Student(id, name, gender, height, age);

        System.out.println("----------------------------------------------------------");
        System.out.print(" 编号为" + student.getId() + ",姓名为" + student.getName());
        System.out.print(",性别为" + student.getGender() + ",身高为" + student.getHeight());
        System.out.println(",年龄为" + student.getAge() + "的学生");
        student.study();
        student.eat();
        System.out.println("----------------------------------------------------------");
    }
}
