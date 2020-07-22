package cn.itcast.task.task01;
/*
第一题:
	定义学生类,包含:学号(String),姓名(String),性别(String),年龄(int);
	1.定义集合存放学生对象, 自己创建若干个学生对象存入, 将集合中的学生对象的信息保存到当前模块下的stu.txt中
	  要求格式为: (学号,姓名,性别,年龄) , 每个学生信息占一行
	2.将stu.txt学生信息读取出来,将每一行封装成一个学生对象, 然后将封装好的学生对象放入集合中
 */
public class Student {
    private String number;
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String number, String name, String gender, int age) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
