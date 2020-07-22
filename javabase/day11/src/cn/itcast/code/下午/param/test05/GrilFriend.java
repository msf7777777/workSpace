package cn.itcast.code.下午.param.test05;

public class GrilFriend {

    private String name;
    private int age;

    public GrilFriend() {
    }

    public GrilFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void cook(){
        System.out.println(name+"正在热火朝天的洗衣服");
    }
}
