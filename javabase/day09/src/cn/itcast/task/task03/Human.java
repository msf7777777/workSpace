package cn.itcast.task.task03;
/*
三. 编程题
	第二题：分析以下需求,并用代码实现
    (1)人类:
        a.属性:姓名,身高
*/
public class Human {
    //1.定义共同属性
    private String name;
    private int height;

    //2.构造无参&有参函数
    public Human() {
    }
    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    //3.给属性提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
