package cn.itcast.code.extends1.test02;
/*
2. 老师类
   属性:姓名,年龄，薪水
   行为:吃饭,睡觉，教书
 */
public class Teacher extends Person {
    private int salary;

    public void teach(){
        System.out.println("教课");
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
