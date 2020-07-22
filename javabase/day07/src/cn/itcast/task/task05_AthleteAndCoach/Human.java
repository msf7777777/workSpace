package cn.itcast.task.task05_AthleteAndCoach;
/*
5.
	我们计划为一所体育学校设计一套系统，需要记录以下人员的信息：
	教练员：
		属性：员工编号、姓名、性别、年龄
		行为：吃饭(吃工作餐)
	运动员：
		属性：学员编号、姓名、性别、年龄、所在班级
		行为：吃饭(吃营养餐)
	请根据需求，设计、并编码实现：
	    父类“人员类”，子类“教练员类”、子类“运动员类”，并包含
	共有的属性和行为的定义
	    由于运动员和教练员的吃饭的内容不同，所以需要设计为“抽象方法”。
 */
public abstract class Human {
    //1.定义共同属性(编号、姓名、性别、年龄)
    private int id;
    private String name;
    private char gender;
    private int age;

    //2.定义抽象方法(吃饭)
    public abstract void eat();

    //3.构造无参&有参函数
    public Human() {
    }
    public Human(int id, String name, char gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //4.给属性提供Getter and Setter方法
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
