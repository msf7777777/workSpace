package cn.itcast.static1;

public class Test2 {

    public static void main(String[] args) {

        ChinesePerson person1= new ChinesePerson("梅军建",18);
        ChinesePerson person2= new ChinesePerson("林青霞",16);

       // person1.nationality = "中国";既然静态的东西属于整个类共享的东西,
        //不建议使用对象来调用, 建议直接使用类名来调用
        ChinesePerson.nationality = "中国";
        System.out.println(person1.nationality);
        System.out.println(person2.nationality);
        ChinesePerson person3= new ChinesePerson("霞霞",16);
        System.out.println(person3.nationality);
    }
}
