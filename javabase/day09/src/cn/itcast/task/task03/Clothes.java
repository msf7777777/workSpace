package cn.itcast.task.task03;
/*
(4)衣服类:
        a.属性:品牌,颜色
 */
public class Clothes {
    //1.定义属性
    private String brand;
    private String color;

    //2.构造无参&有参函数
    public Clothes() {
    }
    public Clothes(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //3.给属性提供Getter and Setter方法
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
