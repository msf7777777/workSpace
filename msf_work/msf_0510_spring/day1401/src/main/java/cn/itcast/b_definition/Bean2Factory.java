package cn.itcast.b_definition;

public class Bean2Factory {
    //特点：通过静态方法获取Bean2
    public static Bean2 getBean2() {
        return new Bean2();
    }
}
