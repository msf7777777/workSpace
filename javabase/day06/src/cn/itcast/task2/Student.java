package cn.itcast.task2;
/*
1. 定义学生类Student, 属性和行为如下:
		属性:
			学员编号: 	String id
			姓名: 	  	String name
			性别:		String gender
			身高:		double height
			年龄:		int age
		行为:
			学习: study()
			吃饭: eat()
 */
/*
        编号为222, 姓名为张三, 性别为男,
        身高为175.3cm, 年龄为23岁的学生,
        正在努力的敲代码, 学习JavaSE相关的知识点.
		学习饿了要吃饭.
 */
public class Student {
    //构造函数
    public Student() {
    }

    //属性
    private String id;
    private String name;
    private String gender;
    private double height;
    private int age;

    //行为1
    public void study(){
        System.out.print("  正在努力的敲代码,学习JavaSE相关的知识点.");
    }
    //行为2
    public void eat(){
        System.out.println("学习饿了要吃饭.");
    }
    //有参函数
    public Student(String id, String name, String gender, double height, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
    }

    //提供Getter and Setter方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
