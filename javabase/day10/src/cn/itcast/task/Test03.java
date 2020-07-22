package cn.itcast.task;

import java.util.Scanner;

/*
3 题目三
	程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
		“积分看电视了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记特朗普”
	请将字符串中所有的”特朗普”替换为”*”符号。
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个发帖内容:");
        String article = sc.next();
        if(article.contains("特朗普")){
            String badArticle = article.replace("特朗普", "*");
            for (int i = 0; i < badArticle.length(); i++) {
                System.out.print(badArticle.charAt(i));
            }
        }else{
            System.out.println("中国共产党感谢你没有政治敏感!");
        }
    }
}
