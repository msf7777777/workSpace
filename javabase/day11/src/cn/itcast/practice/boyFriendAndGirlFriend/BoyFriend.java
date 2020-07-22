package cn.itcast.practice.boyFriendAndGirlFriend;

public class BoyFriend {
    private String name;
    private int age;
    private GirlFriend girlFriend;

    public void shopping(){
        System.out.println(name + " 正在和女朋友 " + girlFriend.getName() + "逛街");
    }
    public void shopping(GirlFriend girlFriend){
        System.out.println(name + " 正在和女朋友 " + girlFriend.getName() + "逛街");
    }

    public BoyFriend() {
    }
    public BoyFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public BoyFriend(String name, int age, GirlFriend girlFriend) {
        this.name = name;
        this.age = age;
        this.girlFriend = girlFriend;
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
    public GirlFriend getGirlFriend() {
        return girlFriend;
    }
    public void setGirlFriend(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }
}
