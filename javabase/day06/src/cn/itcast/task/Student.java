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
public class Student {
    //构造函数
    public Student() {
    }

    //属性
    private String name;
    private int age;
    private String content;

    //行为1:吃饭
    public void eat(){
        System.out.println("正在吃饭");
    }

    //行为2:学习
    public void study(String content){
        System.out.println("正在专心致志的听着" + content + "的知识");
    }

    //有参函数
    public Student(String name, int age, String content) {
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
