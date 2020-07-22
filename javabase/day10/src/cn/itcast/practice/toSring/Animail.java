package cn.itcast.practice.toSring;

public class Animail {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Animail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animail() {
    }
    public Animail(String name, int age) {
        this.name = name;
        this.age = age;
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
}
