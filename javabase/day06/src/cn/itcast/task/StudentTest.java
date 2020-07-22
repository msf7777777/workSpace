package cn.itcast.task;
/*
3. 定义学生类Student, 属性和行为如下, 并在测试类StudentTest中, 创建学生类的对象, 然后访问类中的成员.
	属性:
		姓名: name
		年龄: age
		学习内容: content
	行为:
		吃饭: eat()
		学习: study()
		控制台输出结果格式如下: 	//属性值可以自定义, 但是必须是下述的格式.
			年龄为23的小奇同学正在吃饭....
			年龄为23的小奇同学正在专心致志的听着面向对象的知识....("面向对象"代表学生学习的内容)
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("小奇", 23, "面向对象");
        System.out.print("年龄为" + student.getAge() + "的" + student.getName());
        student.eat();

        Student student2 = new Student();
        student2.setName("大怪");
        student2.setAge(32);
        student2.setContent("面向小情人");
        System.out.print("年龄为" + student2.getAge() + "的" + student2.getName());
        student2.study("<面向小情人>");
    }
}
