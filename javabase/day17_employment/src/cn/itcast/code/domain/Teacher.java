package cn.itcast.code.domain;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override
    public String work() {
        return "我的职责是教课";
    }
}
