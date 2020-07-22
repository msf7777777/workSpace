package cn.itcast.code.set.hashmap;

import java.util.ArrayList;
import java.util.Collections;

public class Test06 {

    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> cards = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        cards.add("o(*￣︶￣*)o");
        cards.add("(#^.^#)");

        //使用嵌套循环让花色和每个点数组合
        for (String color : colors) {
            for (String number : numbers) {
                // 将number和color组合存入集合中
                cards.add(color + number );
            }
        }
        System.out.println(cards);
        //2.洗牌
        Collections.shuffle(cards);
        System.out.println(cards);
        //3.发牌 ----> 总共将牌分为4部分, 3个玩家和1个底牌
        ArrayList<String> 梅军建 = new ArrayList<>();
        ArrayList<String> 林青霞 = new ArrayList<>();
        ArrayList<String> 王祖贤 = new ArrayList<>();
        ArrayList<String> 底牌 = new ArrayList<>();

        //遍历牌
        for (int i = 0; i < cards.size(); i++) {
            String card = cards.get(i);
            if(i >=  cards.size() - 3){// 证明是底牌
                底牌.add(card);
            }else{//证明是玩家的牌
                if(i % 3 == 0){
                    梅军建.add(card);
                }else if(i % 3 == 1){
                    林青霞.add(card);
                }else{
                    王祖贤.add(card);
                }
            }
        }
        //看牌 ---> 看三个玩家和一个底牌
        showCard(梅军建, "梅军建");
        showCard(林青霞, "林青霞");
        showCard(王祖贤, "王祖贤");
        showCard(底牌, "底牌");

    }
    public static void showCard(ArrayList<String> player,String name){
        System.out.print("这是"+ name+"的牌:");
        for (String s : player) {
            System.out.print(s+" ");
        }
        System.out.println();

    }
}
