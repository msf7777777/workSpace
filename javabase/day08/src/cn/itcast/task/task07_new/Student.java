package cn.itcast.task.task07_new;
/*
一. 已知有学生类, 属性为: 姓名, 语文成绩, 数学成绩, 英语成绩,  他们都要吃饭, 睡觉和学习.
    提示用户键盘录入5个学生的信息, 并将这些信息封装成学生对象后, 存储到数组中.
        //数组类型:  Student[] arr = new Student[5];
    需求1: 打印所有学生的信息, 格式为:
		姓名为张三的同学, 语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
		...

    需求2: 打印每个学生的总分, 格式为:
		姓名为张三的同学, 总分为: 300分
		...

    需求3: 打印分数最高的学生信息, 格式如下:
		分数最高的学生是张三, 总分为300分, 其中语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
 */
public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public int getSum(){
        return chinese + math + english;
    }

    public Student() {
    }
    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getChinese() {
        return chinese;
    }
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
}
