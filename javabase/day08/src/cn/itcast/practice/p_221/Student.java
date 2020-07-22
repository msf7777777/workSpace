package cn.itcast.practice.p_221;
/*
比如说，同学们来黑马程序员学校学习,那么我们所有同学的学校都是黑马程序员,
不因每个同学不同而不同。

所以，我们可以这样定义一个静态变量school，代码如下：
 */
public class Student {
    private String name;
    private int age;
    public static int numberOfStudent;
//    final int id;//★★★ So 他 妈 Why ? !

    //1.类变量，记录学生学习的学校
    public static String school = "黑马程序员学校";
    public static void showNum() {
        System.out.println("num:" +  numberOfStudent);
    }

    //2.打印属性值
    public void show() {
        System.out.println("name=" + name + ", age=" + age + ", school=" + school );
    }

    //3.构造无参&有参函数
    public Student() {
    }
    public Student(String name, int age) {
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
    public static int getNumberOfStudent() {
        return numberOfStudent;
    }
    public static void setNumberOfStudent(int numberOfStudent) {
        Student.numberOfStudent = numberOfStudent;
    }
    public static String getSchool() {
        return school;
    }
    public static void setSchool(String school) {
        Student.school = school;
    }

    public static void main(String[] args) {
        Student.numberOfStudent = 222;
        System.out.println(Student.numberOfStudent);//★★★★★★这里可以访问吗?
    }
}

