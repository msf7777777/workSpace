package cn.itcast.test22;
/*
22、1. 定义一个电脑类Computer，包含属性：

    brand(品牌): String类型

    price(价格): double类型

      size (尺寸): String类型

    2. 创建一个ArrayList集合对象list，集合内元素类型为Computer，
    实例化3个Computer对象，
    3个对象的属性分别为：”Apple”,11980, “13寸”;
                        ”Dell” ,5200,”15.5寸”;
                        ”Acer” 4999，”15寸”;
    将3个对象添加到list集合中，并使用for循环遍历集合，将集合中price属性大于5000.0的元素的所有属性在控制台打印出来。

打印示例：
 */
public class Computer {
    private String brand;
    private double price;
    private String size;

    public Computer() {
    }

    public Computer(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
