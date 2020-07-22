package cn.itcast.code.object;

public class Test3 {

    public static void main(String[] args) {
        Student [] arr = {new Student("aaa",18),
                    new Student("bbb",17),
                new Student("ccc",20),
                new Student("ddd",16),
                new Student("eee",15)};
        //帮我们判断数组中是否有一个名字叫eee并且年是15岁的
        Student stu = new Student("eee",15);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if(stu.equals(student)){
                count++;
            }
        }
        if(count == 0){
            System.out.println("证明不存在");
        }else{
            System.out.println("证明存在");
        }

    }
}
