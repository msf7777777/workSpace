package cn.itcast.code.object;
/*
    一个类如何没有显示继承任何类的时候, jvm会帮我们去继承Object

    任何一个类都是Object的子类?   正确
    任何一个类都可以使用Object提供的方法? 正确
    ctrl + N 可以显示搜索窗口
 */
public class Student { //public class Student extends Object {

    private String name;
    private int age;

    private String gender;
    private int height;
    private int weight;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Student(String name, int age, String gender, int height, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
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

    //重写Object父类的toString方法, 希望展示我们的对象属性不要展示地址
    // 快捷重写toString ---> alt + insert


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    //重写equals方法, 让其不在比较地址,而是比较内容

    @Override
    public boolean equals(Object o) {
        // 先比较地址,如果地址一样肯定一样
        if (this == o) return true;
        // 既然equals可以被调用证明this不为null, 判断this的类型和o的类型是否一样
        if (o == null || getClass() != o.getClass()) return false;
        // 成功的将o向下转型成Student,不会出现类型转换异常
        Student student = (Student) o;
        //比较 this的属性和 o的属性
        if (this.age != student.age) return false;
        if (height != student.height) return false;
        if (weight != student.weight) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return gender != null ? gender.equals(student.gender) : student.gender == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + height;
        result = 31 * result + weight;
        return result;
    }



    /*@Override
    public boolean equals(Object obj) {//Object obj = student2
        Student student = (Student) obj;
        // 0x001         0x002
        return this.age  == student.age;
    }*/
}
