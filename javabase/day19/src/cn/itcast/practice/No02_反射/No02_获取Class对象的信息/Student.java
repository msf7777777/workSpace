package cn.itcast.practice.No02_反射.No02_获取Class对象的信息;

public class Student {
    public String name;
    public int age;
    private int id;
    private String fuck;

    public Student() {
    }

    public Student(String name, int age, int id, String fuck) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.fuck = fuck;
    }

    private Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + " 我是Student类的study方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", fuck=" + fuck +
                '}';
    }
}
