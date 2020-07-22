package cn.itcast.code.extends1.test03;
/*
    当子父类中出现重名的属性:
        遵循就近原则
 */
public class Test1 {

    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.num);
    }
}
