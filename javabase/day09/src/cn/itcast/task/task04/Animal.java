package cn.itcast.task.task04;
/*
四. 编程题
	按照要求完成以下内容：

    创建Animal（动物）抽象类，包含：

                成员属性：姓名（name），String类型。

                有参无返回值的抽象方法：void speak (String str)。
 */
public abstract class Animal {
    //1.定义共同属性
    private String name;
    private String type;

    //2.定义抽象方法
    public abstract void speak(String str);

    //3.构造无参&有参函数
    public Animal() {
    }
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //4.给属性提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
