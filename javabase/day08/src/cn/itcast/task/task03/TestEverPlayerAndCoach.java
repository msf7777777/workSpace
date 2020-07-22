package cn.itcast.task.task03;

public class TestEverPlayerAndCoach {
    public static void main(String[] args) {
        //1.测试PingPangPlayer
        PingPangPlayer pingPangPlayer = new PingPangPlayer("麻少飞", 29);
        pingPangPlayer.eat();
        pingPangPlayer.study();
        pingPangPlayer.learnEnglishForPingPang();
        System.out.println("*********************************************");

        //2.测试BasketballPlayer
        BasketballPlayer basketballPlayer = new BasketballPlayer("韩卓君", 20);
        basketballPlayer.eat();
        basketballPlayer.study();
        System.out.println("*********************************************");

        //3.测试PingPangCoach
        PingPangCoach pingPangCoach = new PingPangCoach("李教练", 66);
        pingPangCoach.eat();
        pingPangCoach.teach();
        pingPangCoach.learnEnglishForPingPang();
        System.out.println("*********************************************");

        //4.测试BasketballCoach
        BasketballCoach basketballCoach = new BasketballCoach("孙教练", 56);
        basketballCoach.eat();
        basketballCoach.teach();
        System.out.println("*********************************************");
    }
}
