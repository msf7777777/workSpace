package cn.itcast.task.task07;
/*
一. 已知有学生类, 属性为: 姓名, 语文成绩, 数学成绩, 英语成绩,  他们都要吃饭, 睡觉和学习.
    提示用户键盘录入5个学生的信息, 并将这些信息封装成学生对象后,
        存储到数组中. 	//数组类型:  Student[] arr = new Student[5];
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
    //1.定义共同属性(名字 & 语文成绩 & 数学成绩 & 英语成绩)
    private String name;
    private int chineseResult;
    private int mathResult;
    private int englishResult;

    //2.定义共同方法(吃)
    public void eat(){

    }
    //3.定义共同方法(睡)
    public void sleep(){

    }
    //4.定义共同方法(学习)
    public void study(){

    }

    //5.构造无参&有参函数
    public Student() {
    }
    public Student(String name, int chineseResult, int mathResult, int englishResult) {
        this.name = name;
        this.chineseResult = chineseResult;
        this.mathResult = mathResult;
        this.englishResult = englishResult;
    }

    //6.给属性提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getChineseResult() {
        return chineseResult;
    }
    public void setChineseResult(int chineseResult) {
        this.chineseResult = chineseResult;
    }
    public int getMathResult() {
        return mathResult;
    }
    public void setMathResult(int mathResult) {
        this.mathResult = mathResult;
    }
    public int getEnglishResult() {
        return englishResult;
    }
    public void setEnglishResult(int englishResult) {
        this.englishResult = englishResult;
    }
}
