package cn.itcast.task.task02;

public class TestJavaLecturerAndUILecturer {
    public static void main(String[] args) {
        //1.测试JavaLecturer
        JavaLecturer javaLecturer = new JavaLecturer("梅军建", '男', 32);
        javaLecturer.work();

        //2.测试UILecturer
        UILecturer uiLecturer = new UILecturer("林青霞", '女', 66);
        uiLecturer.work();
        uiLecturer.painting();
    }
}
