package cn.itcast.code.object;
/*
    结论:
        println方法默认打印的是对象toString的结果, 如果我们对象
        不重写, 默认返回的是Object给我提供的地址值字符串表现形式,
        如果重写, 默认打印我们重写过后的内容
    使用场景:
        当我们希望打印对象看到的不是地址而是内容的话, 我们需要手动重写toString
 */
public class Test1 {
    public static void main(String[] args) {
        Student student = new Student("林青霞",18,"女",170,90);//0x001
        System.out.println(student);// 希望看到其中的属性

    }
}
