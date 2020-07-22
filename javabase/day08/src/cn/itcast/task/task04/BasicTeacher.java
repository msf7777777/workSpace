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
public class BasicTeacher extends Teacher {
    //1.重写从父类继承来的抽象方法teach
    @Override
    public void teach() {
        System.out.println("薪水是 " + getSalary() + " 的基础班 " + getAge() + " 岁的老师 " + getName() + " 讲JavaSE");
    }

    //2.构造无参&有参函数
    public BasicTeacher() {
    }
    public BasicTeacher(String name, int age, int salary) {
        super(name, age, salary);
    }
}
