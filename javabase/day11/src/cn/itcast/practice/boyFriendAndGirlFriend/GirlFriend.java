package cn.itcast.practice.boyFriendAndGirlFriend;

public class GirlFriend {
    private String name;
    private int age;

    public void cook(){
        System.out.println(name + "正在做饭");
    }

    public GirlFriend() {
    }
    public GirlFriend(String name, int age) {
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
}
