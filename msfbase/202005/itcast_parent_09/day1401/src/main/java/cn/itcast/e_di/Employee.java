package cn.itcast.e_di;

// 雇员类
public class Employee {
    private String name; // 姓名
    private Car car; // 小汽车

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
