package cn.itcast.task;
/*
某小伙想定一份外卖，商家的优惠方式如下：
鱼香肉丝单点24元(fish)，油炸花生米单点8元(peanut)，米饭单点3元(rice)。
订单满30元8折优惠, 鱼香肉丝优惠价16元，
但是优惠价和折扣不能同时使用。
那么这个小伙要点这三样东西，最少要花多少钱？

*/
public class task02 {
    public static void main(String[] args) {
        //1.定义各个食物价格
        int yuXiang = 24;
        int huaSheng = 8;
        int miFan = 3;
        //2.罗列几种优惠方案
        int yuanJia = yuXiang + huaSheng + miFan;//原价买
        int youHui = 16 + huaSheng + miFan;
        if(yuXiang + huaSheng + miFan >= 30){
            double zheKou = (double)(yuXiang + huaSheng + miFan) * 0.8;
            if(yuanJia <= youHui && yuanJia <= zheKou){
                System.out.println("那么这个小伙要点这三样东西，最少要花: " + yuanJia + " 元钱" + "，原价买");
            }else if(youHui <= yuanJia && youHui <= zheKou){
                System.out.println("那么这个小伙要点这三样东西，最少要花: " + youHui + " 元钱" + "，优惠买");
            }else if(zheKou <= yuanJia && zheKou <= youHui){
                System.out.println("那么这个小伙要点这三样东西，最少要花: " + zheKou + " 元钱" + "，折扣买");
            }else{
                System.out.println("No Way!");
            }
        }else{
            if(yuanJia >= youHui){
                System.out.println("那么这个小伙要点这三样东西，最少要花: " + youHui + " 元钱" + "，优惠买");
            }else{
                System.out.println("那么这个小伙要点这三样东西，最少要花: " + yuanJia + " 元钱" + "，原价买");
            }
        }
    }
}
