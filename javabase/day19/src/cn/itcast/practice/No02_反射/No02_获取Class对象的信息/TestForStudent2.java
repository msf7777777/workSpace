package cn.itcast.practice.No02_反射.No02_获取Class对象的信息;

import org.junit.Test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestForStudent2 {
    @Test
    public void testFun01() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor();
        Student student = (Student)constructor.newInstance();
        System.out.println("调用Study类的成员变量name:" + student.name);
        System.out.println("调用Study类的成员变量age:" + student.age);
        System.out.print("调用Study类的成员方法study:");
        student.study();
        System.out.println(student.toString());
    }

    @Test
    public void testFun02() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);//暴力去除私有权限
        Student student = declaredConstructor.newInstance("麻少飞");//利用构造器创建对象
        student.study();
    }

    @Test
    public void testFun03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class,int.class,int.class,String.class);
        declaredConstructor.setAccessible(true);

        Field field = studentClass.getDeclaredField("id");
        Field field2 = studentClass.getDeclaredField("fuck");
        field.setAccessible(true);
        field2.setAccessible(true);

        Student student = declaredConstructor.newInstance("麻少飞", 29, 7777777, "fuck");
        System.out.println(student.toString());
        System.out.println(student.age);
//        student.id;//脑残行为
        System.out.println(field.getInt(student));
        System.out.println(field2.get(student));
    }

    @Test
    public void testFun04(){
        Class<Student> studentClass = Student.class;
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    @Test
    public void testFun05(){
        Class<Student> studentClass = Student.class;
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
