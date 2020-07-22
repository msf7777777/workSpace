package cn.itcast.task.homework.test02;

public class Teacher {

    //属性:
    private String name;
    private int age;
    private String content;


    //行为
    //吃饭: eat()

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
    }
    //讲课: teach()
    public void teach(){
                System.out.println("年龄为"+age+"的"+name+
                "老师正在亢奋的讲着Java基础中"+content+".......");
    }


    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void method(){
        System.out.println(name +","+ age);
    }
}
