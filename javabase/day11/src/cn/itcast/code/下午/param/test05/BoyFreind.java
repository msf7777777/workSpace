package cn.itcast.code.下午.param.test05;

public class BoyFreind {

    private String name;
    private int age;
    private GrilFriend grilFriend;

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

    public GrilFriend getGrilFriend() {
        return grilFriend;
    }

    public void setGrilFriend(GrilFriend grilFriend) {
        this.grilFriend = grilFriend;
    }

    public BoyFreind() {
    }

    public BoyFreind(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public BoyFreind(String name, int age, GrilFriend grilFriend) {
        this.name = name;
        this.age = age;
        this.grilFriend = grilFriend;
    }

    public void shopping(){
        System.out.println(this.name+"正在陪"+ this.grilFriend.getName()+"逛街,逛街完成之后:");
        //做饭
       this.grilFriend.cook();
    }
    public void shopping(GrilFriend grilFriend){
        System.out.println(name+"正在陪"+ grilFriend.getName()+"逛街,逛街完成之后:");
        //做饭
        grilFriend.cook();
    }
}
