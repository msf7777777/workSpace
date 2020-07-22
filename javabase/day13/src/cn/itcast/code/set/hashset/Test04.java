package cn.itcast.code.set.hashset;

public class Test04 {


        /*
        static String toHexString(int i) 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。


         public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(this.hashCode());
        }
        //  0-9 A-F

        总结:
            hashcode方法如果不重写, 默认是根据真实地址生成的hash值,如果重写了就跟真实地址没有关系

     */
    public static void main(String[] args) {
        Student student = new Student("aaa", 18);
        //cn.itcast.set.hashset.Student@4554617c
        //System.out.println(student);// 走的是谁的?

        System.out.println(student);
    }
}
