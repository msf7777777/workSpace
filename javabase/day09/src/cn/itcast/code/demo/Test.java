package cn.itcast.code.demo;

public class Test {

    public static void main(String[] args) {

        int sum = getSum(10, 20);
        System.out.println(sum + "打印sum");

        int[] arr = {12, 312, 4321, 432, 4, 324};
        printArr(arr);

        method("林青霞", "女", 999, 170, 100);

        Student student = new Student("林青霞", 18, 170, 100, "女");

        method(student);

    }

    public static void method(String name, String gender, int age, int height, int weight) {
        System.out.println(name + " " + gender + " " + age + " " + height + " " + weight);
    }

    public static void method(Student student) {// new Student();地址值
        System.out.println(student.getName() + " " + student.getWeight() + " " + student.getHeight() + " " + student.getAge() + " " + student.getGender());
    }


    public static void printArr(int[] arr) {
        System.out.println(arr[1]);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
