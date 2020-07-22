package cn.itcast.practice.p_221;

public class StuDemo2 {
    public static void main(String[] args) {
        // 访问类变量
        Student.setNumberOfStudent(7777777);
        System.out.println(Student.numberOfStudent);//★★★这里可以访问吗?
        System.out.println(Student.getNumberOfStudent());
        // 调用静态方法
        Student.showNum();
    }
}
