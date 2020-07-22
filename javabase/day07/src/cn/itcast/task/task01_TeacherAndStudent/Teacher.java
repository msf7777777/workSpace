package cn.itcast.task.task01_TeacherAndStudent;
/*
1. 已知有老师和学生都有姓名和年龄, 且都有吃饭的方法, 不同的是: 学生吃牛肉, 老师喝牛肉汤.
   学生要学习study(), 老师要讲课teach(), 请用所学, 模拟该知识.
 */
public class Teacher extends People {
    //1.继承父类抽象方法并定义
    @Override
    public void eat() {
        System.out.println(getName() + "是老师,吃点牛肉吧!");
    }

    //2.定义老师独有方法(讲课)
    public void teach(){
        System.out.println("老师今年" + getAge() + ",要给学生讲课!");
    }

    //3.构造无参&有参函数
    public Teacher() {
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
}
