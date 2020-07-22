package cn.itcast.task;
/*
11. 把1~100之间的奇数, 按照6个一行的格式进行输出.
    //核心点: 统计遍历, 输出一个就++,  标记变量: 几个一行.
*/
public class task11 {
    public static void main(String[] args) {
        //设置一个计数器
        int count = 0;
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
                count++;
                if(count % 6 == 0){
                    System.out.println();
                }
            }
        }
    }
}
