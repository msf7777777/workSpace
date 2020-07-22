package cn.itcast.code.extends1.test02;
/*
        属性 :姓名,年龄
      行为 ：吃饭,睡觉
 */
public class Person {
    private String name;
    private int age;

    public void eat(){
        System.out.println("吃面条");
    }
    public void sleep(){
        System.out.println("睡觉");
    }


    public Person() {
    }
    public Person(String name, int age) {
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
