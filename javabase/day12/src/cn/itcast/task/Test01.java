package cn.itcast.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
1.请定义一个Collection类型的集合，存储以下字符串：
		“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，
		”Java架构师之路”
	请编程实现以下功能：
 使用迭代器遍历所有元素，并打印
 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
	(注意：以上功能写在一个main()方法中，但请单独实现)
 */
public class Test01 {
    public static void main(String[] args) {
        //1.创建对象实现父类方法
        Collection col = new ArrayList();
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");
        col.add("123456789");
        //2.使用迭代器遍历所有元素，并打印
        System.out.println("第一次打印");
        Iterator<String> it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //3.筛选书名小于10个字符的，并打印
        Iterator<String> it2 = col.iterator();
        System.out.println("第二次打印");
        while(it2.hasNext()){
            String str= it2.next();
            if(str.length() < 10){
                System.out.println(str);
            }
        }
        //4.筛选书名中包含“Java”的，并打印
        Iterator<String> it3 = col.iterator();
        System.out.println("第三次打印");
        while(it3.hasNext()){
            String str= it3.next();
            if(str.contains("Java")){
                System.out.println(str);
            }
        }
        //5.如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        Iterator<String> it4 = col.iterator();
        while(it4.hasNext()){
            if(it4.next().contains("Oracle")){
                it4.remove();
            }
        }
        System.out.println("第四次打印");
        System.out.println(col);
    }
}
