package cn.itcast.task.task04;
/*
四. 已知传智播客公司有  基础班老师(BasicTeacher)和就业班老师(WorkTeacher),
                       基础班学生(BasicStudent)和就业班学生(WorkStudent).
   他们都有姓名, 年龄, 都要吃饭, 不同的是学生吃牛肉, 老师喝牛肉汤.
   老师有自己的额外属性: 工资(salary), 且老师需要讲课
        (基础班老师讲JavaSE, 就业班老师讲JavaEE, Hadoop, Hive, Scala, Flink, Spark等).
   基础班学生学习JavaSE, 就业班学生学习JavaEE, Hadoop, Hive, Scala, Flink, Spark等.
   为了扩大就业市场, 跟就业班相关的人员都需要学习英语.
   请用所学, 模拟该知识.
 */
public abstract class Teacher extends People {
    //0.定义老师额外属性salary
    private int salary;

    //1.重写从父类继承来的抽象方法eat
    @Override
    public void eat() {
        System.out.println(getName() + " 老师喝牛肉汤");
    }

    //2.定义老师独有方法teach
    public abstract void teach();

    //3.构造无参&有参函数
    public Teacher() {
    }
    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    //4.给属性提供Getter and Setter方法
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
