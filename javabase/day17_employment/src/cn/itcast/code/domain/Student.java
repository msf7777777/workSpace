package cn.itcast.code.domain;

public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override
    public String work() {
       return "学生的职责是学习";
    }

    @Override
    public String show() {
        return super.show()+"\t\t"+work();
    }
}
