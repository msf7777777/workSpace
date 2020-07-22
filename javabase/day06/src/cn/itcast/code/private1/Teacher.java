package cn.itcast.code.private1;

public class Teacher {
    public Teacher(){}
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

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

    public void teach(){
        System.out.println("好好学习,天天向上!");
    }
}
