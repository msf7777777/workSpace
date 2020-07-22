package cn.itcast.task.task04;

public class TestEverStudentAndTeacher {
    public static void main(String[] args) {
        //1.测试BasicStudent
        BasicStudent basicStudent = new BasicStudent("麻少飞", 29);
        basicStudent.study();
        basicStudent.eat();
        System.out.println("*********************************************");

        //2.测试WorkStudent
        WorkStudent workStudent = new WorkStudent("韩卓君", 20);
        workStudent.study();
        workStudent.eat();
        workStudent.learnEnglish();
        System.out.println("*********************************************");

        //3.测试BasicTeacher
        BasicTeacher basicTeacher = new BasicTeacher("李老师", 56, 2000);
        basicTeacher.teach();
        basicTeacher.eat();
        System.out.println("*********************************************");

        //4.测试WorkTeacher
        WorkTeacher workTeacher = new WorkTeacher("韩老师", 46, 10000);
        workTeacher.teach();
        workTeacher.eat();
        workTeacher.learnEnglish();
        System.out.println("*********************************************");


    }
}
