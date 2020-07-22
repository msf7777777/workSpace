package cn.itcast.code.private1;

public class Test01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "麻少飞";
        student.setAge(150);
        System.out.println(student.name+","+ student.getAge());
    }
}
