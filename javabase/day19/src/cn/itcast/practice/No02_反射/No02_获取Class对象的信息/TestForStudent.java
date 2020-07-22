package cn.itcast.practice.No02_反射.No02_获取Class对象的信息;

import org.junit.Test;

public class TestForStudent {
    @Test
    public void testFun01() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<Student> studentClass = Student.class;
        //基于Class对象,获取到类的名称
        String simpleName = studentClass.getSimpleName();//仅获取类名(不包含包路径)
        System.out.println(simpleName);

        String name = studentClass.getName();//获取类名(包含包名的全路径)
        System.out.println(name);

        //基于Class对象,创建Student对象的实现
        Class<?> aClass = Class.forName("cn.itcast.practice.No02_反射.No02_获取Class对象的信息.Student");
        Object o = (Student)aClass.newInstance();
        System.out.println(((Student) o).age);
        System.out.println(((Student) o).name);
        ((Student) o).study();
        System.out.println(o.toString());
        System.out.println(Class.forName("cn.itcast.practice.No02_反射.No02_获取Class对象的信息.Student").newInstance());
    }
}
