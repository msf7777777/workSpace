package cn.itcast.string.equals;

public class Test2 {

    public static void main(String[] args) {
        String[] arr = {"2345","3214","26534","qtqe",new String("3214")};
        //想要将所有的"3214"找出来打印到控制台
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals( "3214")){// 这里建议使用equals方法
                System.out.println(arr[i]);
            }
        }
    }
}
