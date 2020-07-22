package cn.itcast.code.set.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test08 {

    public static void main(String[] args) {
        //1.HashMap --->定义牌和数字的关系
        ArrayList<String> list = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        list.add("大王");
        list.add("小王");

        for (String number : numbers) {
            for (String color : colors) {
                list.add(color+ number);
            }
        }
        //2.准备牌 ---> 我们操作的是方便排序的数字
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            cards.add(i);
        }
        //3.洗牌
        Collections.shuffle(cards);
        //4.发牌
        ArrayList<Integer> 梅军建 = new ArrayList<>();
        ArrayList<Integer> 林青霞 = new ArrayList<>();
        ArrayList<Integer> 豆腐妹 = new ArrayList<>();
        ArrayList<Integer> 底牌 = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            Integer card = cards.get(i);
            if (i >= cards.size() - 3) {
                底牌.add(card);
            } else {
                if (i % 3 == 0) {
                    梅军建.add(card);
                } else if (i % 3 == 1) {
                    林青霞.add(card);
                } else {
                    豆腐妹.add(card);
                }
            }
        }
        //对手中的牌进行排序
        Collections.sort(梅军建);
        Collections.sort(林青霞);
        Collections.sort(豆腐妹);
        Collections.sort(底牌);

        //5.看牌
        showCards(林青霞, "林青霞", list);
        showCards(梅军建, "梅军建", list);
        showCards(豆腐妹, "豆腐妹", list);
        showCards(底牌, "底牌", list);


    }
    public static void showCards(ArrayList<Integer> player,String name, ArrayList<String> list){
        System.out.print("展示"+ name+"的牌:");
        for (Integer card : player) {
            String cardStr = list.get(card);
            System.out.print(cardStr+" ");
        }
        System.out.println();
    }

}
