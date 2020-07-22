package cn.itcast.反射;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class Demo02 {

    // 演示 通过反射的方式, 获取类中公共 或者 私有的方法, 并调用这些方法
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //1. 获取类的字节码文件对象
        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");

        //2. 获取Fucker类中相关的方法:
        //2.1: 获取 无参数的公共的方法
        Method eatMethod = fuckerClass.getMethod("eat");
        System.out.println("【test01_getMethod】" + eatMethod);

        //2.2 如何调用这个eat的方法呢?
        /*Constructor<?> constructor = personClass.getConstructor();
        Object person = constructor.newInstance();*/
        Object fucker = fuckerClass.newInstance();
        Object invokeFucker = eatMethod.invoke(fucker);
        System.out.println("【test01_invoke】" + invokeFucker);

    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //1. 获取类的字节码文件对象
        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");

        //2. 获取有参数的公共的方法
        Method runMethod = fuckerClass.getMethod("run",String.class);
        System.out.println("【test02_getMethod】" + runMethod);

        //3. 如何调用这个有参数的方法
        Object fucker = fuckerClass.newInstance();
        Object invokeFuckerRun = runMethod.invoke(fucker, "麻少飞");
        System.out.println("【test02_invoke】" + invokeFuckerRun);

    }

    @Test
    public void test03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //演示获取私有的方法的操作:
        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Method studyMethod = fuckerClass.getDeclaredMethod("fuck");
        Object fucker = fuckerClass.newInstance();
        studyMethod.setAccessible(true);
        Object invokeFuckerFuck = studyMethod.invoke(fucker);
        System.out.println("【test03_invoke】" + invokeFuckerFuck);

    }

    @Test
    public void test04() throws ClassNotFoundException {

        //获取所有的方法
        Class<?> fuckerClass = Class.forName("cn.itcast.反射.Fucker");
        Method[] methods = fuckerClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }

    @Test
    public void test05() {


    }

}
