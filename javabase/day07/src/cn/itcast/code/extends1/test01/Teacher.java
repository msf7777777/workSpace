package cn.itcast.code.extends1.test01;
/*
2. 老师类
   属性:姓名,年龄，薪水
   行为:吃饭,睡觉，教书
 */
public class Teacher {
    private String name;
    private int age;
    private int salary;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void teach(){
        System.out.println("教书");
    }

    public Teacher() {
    }
    public Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
