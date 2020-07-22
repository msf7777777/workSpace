package cn.itcast.code.classdefine;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "梅军建";
        System.out.println(teacher.name);
        teacher.teach();
        teacher.eat();
    }
}