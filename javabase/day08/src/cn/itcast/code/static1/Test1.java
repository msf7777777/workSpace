package cn.itcast.static1;

public class Test1 {

    public static void main(String[] args) {
        //1.第一个中国人
        ChinesePerson person1 = new ChinesePerson("梅军建",18,"中国");
        ChinesePerson person2 = new ChinesePerson("林青霞",16,"中国");
        ChinesePerson person3 = new ChinesePerson();
        person3.setName("王祖贤");
        person3.setAge(20);

        System.out.println(person1.getNationality());
        System.out.println(person2.getNationality());
        System.out.println(person3.getNationality());


    }
}
