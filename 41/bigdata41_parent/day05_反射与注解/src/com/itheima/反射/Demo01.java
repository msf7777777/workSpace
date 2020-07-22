package com.itheima.反射;

import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Constructor;


public class Demo01  {


    // 演示 获取class对象的三种方式
    @Test
    public  void test01() throws Exception{
        //1. 通过 类名.class的操作
        Class<Demo01> demo01Class1 = Demo01.class;
        System.out.println(demo01Class1);

        //2. 通过 对象.gerClass的操作
       /* Demo01 demo01 = new Demo01();
        Class<? extends Demo01> demo01Class2 = demo01.getClass();
        System.out.println(demo01Class2);*/

        //3. 通过 全限类名的方式来获取字节码文件对象
        Class<?> demo01Class3 = Class.forName("com.itheima.反射.Demo01");

        System.out.println(demo01Class3);
    }


    // 演示获取class对象的信息的方法
    @Test
    public void test02() throws Exception{
        //1. 获取一个字节码文件对象
        Class<Demo01> demo01Class = Demo01.class;

        //2. 演示相关的方法:
        String className = demo01Class.getName();

        String simpleName = demo01Class.getSimpleName();

        System.out.println("className:"+className);
        System.out.println("simpleName:"+simpleName);


        Demo01 demo01 = demo01Class.newInstance(); // 相当于创建demo01的对象  默认使用空参的构造来创建对象
        System.out.println(demo01);

        ClassLoader classLoader = demo01Class.getClassLoader();
        // InputStream getResourceAsStream(String name)
        InputStream inputStream = classLoader.getResourceAsStream("a.txt");
        byte[] b = new byte[1024];
        int len ;
        while(  (len = inputStream.read(b) ) != -1  ){

            System.out.println(new String(b,0,len));
        }

    }

    // 反射获取构造对象, 并使用这个构造对象来创建实例对象
    @Test
    public void  tets03() throws Exception{

        //1. 获取class字节码对象
        Class<?> personClass = Class.forName("com.itheima.反射.Person");

        //2. 获取有三个参数的公共的构造方法:
        // 注意: 参数传递是构造方法需要传递的参数类型的class文件 ,如果构造不需要参数, 那么就什么都不传递就可以
        Constructor<?> constructor = personClass.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);
        Person person1 = (Person) constructor.newInstance("张三", 123456, 30);
        System.out.println(person1);
        person1.eat();
        System.out.println("------------");
        //2.2: 获取公共的无参数的构造方法
        Constructor<?> constructor1 = personClass.getConstructor();
        Object person2 = constructor1.newInstance();
        System.out.println(person2);
        // ----  这种无参数的创建对象的过程 可以简写为:
        Object person3 = personClass.newInstance();
        System.out.println(person3);

        // 2.3 获取 传递两个参数的私有构造
        // java.lang.NoSuchMethodException : 表示没有找到这个两个参数的构造方法, 因为这个方法是私有的
        /*Constructor<?> constructor2 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor2);  这种方式拿不到私有的*/

        Constructor<?> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true); // 擦除权限
        Object person4 = declaredConstructor.newInstance("李四", 123456);

        System.out.println(person4);

        System.out.println("------------------");
        // 2.4: 演示获取全部的构造的方法:
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constr : constructors) {
            System.out.println(constr);
        }
        System.out.println("------------------");

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> constr : declaredConstructors) {
            System.out.println(constr);
        }

    }
}
