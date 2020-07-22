package cn.itcast.反射;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo01 {

    @Test
    public void test01() {

        Class<Demo01> demo01Class = Demo01.class;
        System.out.println("【test01】" + demo01Class);

    }

    @Test
    public void test02() {

        Demo01 demo01 = new Demo01();
        Class<? extends Demo01> demo01GetClass = demo01.getClass();
        System.out.println("【test02】" + demo01GetClass);

    }

    @Test
    public void test03() throws ClassNotFoundException {

        Class<?> demo01ClassForName = Class.forName("cn.itcast.反射.Demo01");
        System.out.println("【test03】" + demo01ClassForName);

    }

    @Test
    public void test04() {

        Class<Demo01> demo01Class = Demo01.class;

        String name = demo01Class.getName();
        System.out.println("【test04_getName】" + name);

        String simpleName = demo01Class.getSimpleName();
        System.out.println("【test04_getSimpleName】" + simpleName);

    }

    @Test
    public void test05() throws IllegalAccessException, InstantiationException, IOException {

        Class<Demo01> demo01Class = Demo01.class;

        Demo01 demo01 = demo01Class.newInstance();
        System.out.println("【test05_newInstance】" + demo01);

        ClassLoader classLoader = demo01Class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("msf.txt");

        byte[] bytes = new byte[8 * 1024];
        int len;
        System.out.println("****【msf.txt文件内容】****");
        while ( (len = inputStream.read(bytes)) != -1 ) {

            System.out.println(new String(bytes,0,len));

        }
        System.out.println("***************************");
    }

    @Test
    public void test06() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Constructor<?> constructor = fuckerClass.getConstructor(String.class, int.class, int.class);
        System.out.println("【test06_getConstructor】" + constructor);
        Fucker fuckerMsf = (Fucker) constructor.newInstance("麻少飞", 19901113, 29);
        System.out.println("【test06_newInstance】" + fuckerMsf);
        System.out.print("【test06_fuckerMsf.eat（公开方法）】");fuckerMsf.eat();
        System.out.print("【test06_fuckerMsf.run（公开方法）】");fuckerMsf.run("麻少飞");
        System.out.println("*****************************************************************************");

    }

    @Test
    public void test07() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Constructor<?> constructor = fuckerClass.getConstructor();
        Object fuckerMsf = constructor.newInstance();
        System.out.println("【test07_newInstance】" + fuckerMsf);

        Object fuckerMsf2 = fuckerClass.newInstance();
        System.out.println("【test07_newInstance2】" + fuckerMsf2);

    }

    @Test
    public void test08() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Constructor<?> declaredConstructor = fuckerClass.getDeclaredConstructor(String.class, int.class);
        System.out.println("【test08_getDeclaredConstructor】" + declaredConstructor);
        declaredConstructor.setAccessible(true);
        Object fuckerMsf = declaredConstructor.newInstance("张嘉敏", 19960122);
        System.out.println(fuckerMsf);

    }

    @Test
    public void test09() throws ClassNotFoundException {

        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Constructor<?>[] constructors = fuckerClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

    }

    @Test
    public void test10() throws ClassNotFoundException {

        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Constructor<?>[] declaredConstructors = fuckerClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

}
