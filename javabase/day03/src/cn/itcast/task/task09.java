package cn.itcast.task;
/*
9. 求1-100之间的偶数和，并把求和结果打印到控制台上.
*/
public class task09 {
    public static void main(String[] args) {
        //定义一个总和
        int result = 0;
        for(int i = 1;i <= 100;i++){
            if((result + i) % 2 == 0){
                result += i;
            }
        }
        System.out.println(result);
    }
}
