package cn.itcast.task.homework.test03;
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
public class Test01 {
    public static void main(String[] args) {
        Student student = new Student("梅军建",18,"好姿势");
        student.eat();

        Student student1 = new Student("军建",18,"好姿势");
        student1.eat();
    }
}
