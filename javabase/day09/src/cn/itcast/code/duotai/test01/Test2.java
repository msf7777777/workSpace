package cn.itcast.code.duotai.test01;
/*
    多态的缺点:
        不能使用子类特有的属性和方法
    多态中非要使用子类特有方法, 需要向下转型
        格式:
            子类类型 变量名 = (子类类型)父类引用;
 */
public class Test2 {
    //多态不能直接使用子类特有的东西!!!!!!!!
    public static void main(String[] args) {
        Animal animal = new Cat();//多态本来就是一种向上转型, 乔装
        animal.method();
        // 缺点结论: 多态不能访问子类特有的内容!!!!!!!!!!!!
        //animal.mothodZi();
        //System.out.println(animal.zinum);
        //如果非要访问, 必须向下转型
        //向下转型 ---->卸妆的过程
        //格式:  子类类型 变量名 = (子类类型)父类引用;
//        cat.methodZi();//报错
//        System.out.println(cat.ziNumber);//报错
        Cat cat = (Cat) animal;
        cat.methodZi();
        System.out.println(cat.ziNumber);


    }
}
