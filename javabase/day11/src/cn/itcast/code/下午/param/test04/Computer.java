package cn.itcast.code.下午.param.test04;

public class Computer {

    private String cpu;
    private int momery;
    private int price;
    private String brand;

    public Computer() {
    }

    public Computer(String cpu, int momery, int price, String brand) {
        this.cpu = cpu;
        this.momery = momery;
        this.price = price;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMomery() {
        return momery;
    }

    public void setMomery(int momery) {
        this.momery = momery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void startUp(){
        System.out.println("开机");
    }
}
