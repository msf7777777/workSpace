package cn.itcast.task.task06;
/*
题目六
	程序从控制台一次性接收一个学员信息，
	要求程序必须能正确处理以下几种格式的数据：
		“张三,20,男”
	编程：
	定义学员类，可以存储上述数据(姓名String，年龄int，性别char)
	定义测试类，创建一个学员对象，从控制台接收一名学员信息，
	并能正确解析，并将数据存储到学员对象中，最后打印这个学员对象的所有属性的值。
 */
public class Student {
    //1.成员变量
    private String name;
    private int age;
    private String gender;

    //2.有参无参&getter和setter
    public Student() {
    }
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
