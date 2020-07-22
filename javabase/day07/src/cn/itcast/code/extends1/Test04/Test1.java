package cn.itcast.code.extends1.Test04;

/*
    当子父类中出现重名的属性:
        遵循就近原则
 */
public class Test1 {

    public static void main(String[] args) {
        Zi zi = new Zi();
        int num = zi.getNum();
        System.out.println(num);


    }
}
