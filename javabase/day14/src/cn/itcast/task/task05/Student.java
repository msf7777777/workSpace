package cn.itcast.task.task05;
/*
1.5 题目五
	请按以下步骤要求编写代码：
	定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
	定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
	定义一个Student类，属性：姓名、性别、年龄。
	在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
	在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
	编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }
    public Student(String name, int age, String gender) throws Exception {
        this.name = name;
        if(age < 15 || age > 50){
            throw new AgeException("年龄异常");
        }else{
            this.age = age;
        }
        if(!gender.equals("男") && !gender.equals("女")){
            throw new SexException("性别异常");
        }else{
            this.gender = gender;
        }
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
        if(age < 15 || age > 50){

        }else{
            this.age = age;
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if(!gender.equals("男") && !gender.equals("女")){

        }else{
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "信息正常{" +
                "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + gender + '\'' +
                '}';
    }
}
