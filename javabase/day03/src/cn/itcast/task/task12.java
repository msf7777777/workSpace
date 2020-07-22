package cn.itcast.task;
/*
12. 已知世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米).
    假如我有一张足够大的纸，它的厚度是0.1毫米.
    请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
    //即: 纸张的厚度 >= 珠穆朗玛峰的高度
*/
public class task12 {
    public static void main(String[] args) {
        //设置一个计数器
        int count = 0;
        for(double i = 0.1;i < 8844430;i++){
            i = (double)2 * i;
            count++;
        }
        System.out.println(count);
    }
}
