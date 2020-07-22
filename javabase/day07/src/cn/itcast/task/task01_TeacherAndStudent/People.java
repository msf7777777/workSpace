package cn.itcast.task.task01_TeacherAndStudent;
/*
1. 已知有老师和学生都有姓名和年龄, 且都有吃饭的方法, 不同的是: 学生吃牛肉, 老师喝牛肉汤.
   学生要学习study(), 老师要讲课teach(), 请用所学, 模拟该知识.
 */
public abstract class People {
    //1.定义共同属性(名字&年龄)
    private String name;
    private int age;

    //2.定义抽象方法(吃)
    public abstract void eat();

    //3.构造无参&有参函数
    public People() {
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //4.给属性提供Getter and Setter方法
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
}
