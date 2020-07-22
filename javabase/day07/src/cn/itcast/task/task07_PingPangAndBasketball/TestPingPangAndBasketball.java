package cn.itcast.task.task07_PingPangAndBasketball;

public class TestPingPangAndBasketball {
    public static void main(String[] args) {
        //1.创建PingPangPlayer对象测试类中方法
        PingPangPlayer pingPangPlayer = new PingPangPlayer("张嘉敏", 23);
        pingPangPlayer.eat();//输出pingPangPlayer的方法eat
        pingPangPlayer.train();//输出pingPangPlayer的方法train

        //2.创建BasketballPlayer对象测试类中方法
        BasketballPlayer basketballPlayer = new BasketballPlayer("麻少飞", 29);
        basketballPlayer.eat();//输出basketballPlayer的方法eat
        basketballPlayer.train();//输出basketballPlayer的方法train

        //3.创建PingPangCoach对象测试类中方法
        PingPangCoach pingPangCoach = new PingPangCoach("李教练", 57);
        pingPangCoach.eat();//输出pingPangCoach的方法eat
        pingPangCoach.teach();//输出pingPangCoach的方法teach

        //3.创建PingPangCoach对象测试类中方法
        BasketballCoach basketballCoach = new BasketballCoach("孙阳", 28);
        basketballCoach.eat();//输出basketballCoach的方法eat
        basketballCoach.teach();//输出basketballCoach的方法teach
    }
}
