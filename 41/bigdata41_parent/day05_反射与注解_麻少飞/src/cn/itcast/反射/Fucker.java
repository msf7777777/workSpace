package cn.itcast.反射;

public class Fucker {

    private String name;
    private int password;
    public int age;

    public void eat() {
        System.out.println("次饭饭");
    }

    public void run(String name) {
        System.out.println("跑步啊啊啊啊啊啊啊");
    }

    private void fuck() {
        System.out.println("fucking fucking fucking fucking fucking fucking");
    }

    public Fucker() {
    }

    public Fucker(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    private Fucker(String name, int password) {
        this.name = name;
        this.password = password;
    }


}
