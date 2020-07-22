package cn.itcast.task.homework.test05;
/*(4)衣服类:
        a.属性:品牌,颜色*/
public class Cloth {

    private String brand;
    private String color;


    public Cloth() {
    }

    public Cloth(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

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
