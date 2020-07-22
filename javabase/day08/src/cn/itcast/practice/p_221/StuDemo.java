package cn.itcast.practice.p_221;
/*
比如说，同学们来黑马程序员学校学习,那么我们所有同学的学校都是黑马程序员,
不因每个同学不同而不同。

所以，我们可以这样定义一个静态变量school，代码如下：
*/
public class StuDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 26);
        Student s5 = new Student();
        s5.setName("麻七");
        s5.setAge(29);

        s1.show(); // Student : name=张三, age=23, school=黑马程序员学校
        s2.show(); // Student : name=李四, age=24, school=黑马程序员学校
        s3.show(); // Student : name=王五, age=25, school=黑马程序员学校
        s4.show(); // Student : name=赵六, age=26, school=黑马程序员学校
        s5.show(); // Student : name=张三, age=23, school=黑马程序员学校
    }
}
