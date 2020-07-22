package cn.itcast.practice.No04_匿名内部类;

public class Test01_Runnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 6; i++) {
                    System.out.println("张嘉敏: " + i);
                }
            }
        };
        new Thread(r).start();
        for (int i = 1; i <= 7; i++) {
            System.out.println("main麻少飞: " + i);
        }
    }
}
