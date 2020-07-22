package cn.itcast.task.homework.test05;

public class Student {

    private String name;
    private int age;
    private String gender;

    public Student() {
    }



    public Student(String name, int age, String gender) {
        //省略不写,
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public void setAge(int age) throws AgeException {
        if(age > 0 && age < 50 ){
            this.age = age;
        }else{
            throw new AgeException("年龄有错误");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws GenderException {

       if( gender.equals("男") || gender.equals("女")){
           this.gender = gender;
       }else{
           //如果造的是一个运行时异常可以不处理
           throw new GenderException("性别异常了");
       }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
