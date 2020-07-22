package cn.itcast.task;

import javax.swing.*;

/*
2. 定义老师类Teacher, 属性和行为如下, 并在测试类TeacherTest中, 创建老师类的对象, 然后访问类中的成员.
	属性:
		姓名: name
		年龄: age
		讲课内容: content
	行为:
		吃饭: eat()
		讲课: teach()
		控制台输出结果格式如下:
		    //属性值可以自定义, 但是必须是下述的格式.
			  年龄为32的刘立老师正在吃饭....
			  年龄为32的刘立老师正在亢奋的讲着Java基础中面向对象的知识........("Java基础中面向对象"代表老师讲课的内容)
*/
public class Teacher {
    //构造函数
    public Teacher() {
    }

    //属性
    private String name;
    private int age;
    private String content;

    //行为1:吃饭
    public void eat(String name, int age){
        System.out.println("年龄为" + age + "的" + name + "老师正在吃饭");
    }

    //行为2:讲课
    public void teach(String name, int age, String content){
        System.out.println("年龄为" + age + "的" + name + "老师正在亢奋的讲着" + content + "的知识");
    }

    //有参函数
    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    //提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
