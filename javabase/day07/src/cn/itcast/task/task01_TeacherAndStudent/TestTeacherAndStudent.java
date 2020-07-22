package cn.itcast.task.task01_TeacherAndStudent;
/*
1. 已知有老师和学生都有姓名和年龄, 且都有吃饭的方法, 不同的是: 学生吃牛肉, 老师喝牛肉汤.
   学生要学习study(), 老师要讲课teach(), 请用所学, 模拟该知识.
 */
public class TestTeacherAndStudent {
    public static void main(String[] args) {
        //1.创建Student对象测试类中方法
        Student student = new Student("麻少飞", 19);//参数代入方法创建Student对象
        student.setAge(29);//set方法更改参数
        student.eat();//Student类继承父类抽象方法eat输出
        student.study();//Student类独有方法study输出

        //2.创建Teacher对象测试类中方法
        Teacher teacher = new Teacher();//无参方法创建Teacher对象
        teacher.setName("梅军建");//set方法设置参数name
        teacher.setAge(32);//set方法设置参数age
        teacher.eat();//Teacher类继承父类抽象方法输出
        teacher.teach();//Teacher类独有方法输出
    }
}
