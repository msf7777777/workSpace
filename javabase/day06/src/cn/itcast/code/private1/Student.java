package cn.itcast.code.private1;

public class Student {
    //属性
    String name;
    private int age;

    public void setAge(int age ){
        if(age < 0 || age > 150){
            System.out.println("fuck off");
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    //行为
    public void study(){
        System.out.println("好好学习,天天敲代码!");
    }
    public void sleep(){
        System.out.println("好好睡觉,梦里敲代码!");
    }
}
