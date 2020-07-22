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
public abstract class People {
    //1.定义共同属性(名字&年龄)
    private String name;
    private int age;

    //2.定义抽象方法(吃)
    public abstract void eat();

    //3.构造无参&有参函数
    public People() {
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //4.给属性提供Getter and Setter方法
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
