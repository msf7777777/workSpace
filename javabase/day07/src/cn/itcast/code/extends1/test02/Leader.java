package cn.itcast.code.extends1.test02;
/*
2. 班导类
   属性:姓名,年龄，薪水
   行为:吃饭,睡觉，管理
 */
public class Leader extends Person {
    private int salary;

    public void manage(){
        System.out.println("管理");
    }

    public int getSalary() {

        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
