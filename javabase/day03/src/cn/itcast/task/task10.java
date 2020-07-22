package cn.itcast.task;
/*
10. 打印1000及以内所有的水仙花数, 及水仙花数的总个数.
*/
public class task10 {
    public static void main(String[] args) {
        //设置一个计数器
        int count = 0;
        System.out.println("1000及以内所有的水仙花数是：");
        for(int i = 0;i <= 1000;i++){
            //得出i的各位的数字
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if(i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("1000及以内水仙花数的总个数是：" + count);
    }
}
