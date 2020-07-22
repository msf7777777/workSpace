package cn.itcast.e_di;

public class Car {
    private String name;
    private int price;

    // 注意: 因为提供了满参构造, 所以 默认提供的无参构造就没有了
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
