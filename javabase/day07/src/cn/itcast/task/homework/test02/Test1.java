package cn.itcast.task.homework.test02;
/*
2. 定义老师类Teacher, 属性和行为如下, 并在测试类TeacherTest中, 创建老师类的对象, 然后访问类中的成员.
	属性:
		姓名: name
		年龄: age
		讲课内容: content
	行为:
		吃饭: eat()
		讲课: teach()

		控制台输出结果格式如下:   //属性值可以自定义, 但是必须是下述的格式.
			年龄为32的刘立老师正在吃饭....
			年龄为32的刘立老师正在亢奋的讲着Java基础中面向对象的知识........("Java基础中面向对象"代表老师讲课的内容)
*/


public class Test1 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("梅军建");
        teacher.setAge(18);
        teacher.setContent("面向对象");
        teacher.eat();
        teacher.teach();

    }
}
