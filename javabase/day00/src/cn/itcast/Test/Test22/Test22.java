package cn.itcast.Test.Test22;

import java.util.ArrayList;

public class Test22 {
    public static void main(String[] args) {
        Fruit apple = new Fruit("苹果", 12, false);
        Fruit orange = new Fruit("柑橘", 4, true);
        Fruit banana = new Fruit("香蕉", 4, false);
        Fruit peach = new Fruit("桃子", 6, true);

        ArrayList<Fruit> coll = new ArrayList();
        coll.add(0,apple);
        coll.add(1,orange);
        coll.add(2,banana);
        coll.add(3,peach);

        for (int i = 0; i < coll.size(); i++) {
            if(coll.get(i).isDiscount()){
                coll.get(i).setPrice(coll.get(i).getPrice() / 2);
            }
        }

        int newPrice = 0;
        for (int i = 0; i < coll.size(); i++) {
            newPrice += coll.get(i).getPrice();
        }
        System.out.println(newPrice);

    }
}
