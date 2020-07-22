package cn.itcast.task.task02;
/*
二.	编程题
	实现课堂上榨汁机的案例
 */
public class Test {
    public static void main(String[] args) {
        Fruit appleZha = new Apple();
        appleZha.zha();

        zha(new Apple());

        zha(new Fruit() {
            @Override
            public void zha() {
                System.out.println("炸一杯苹果汁");
            }
        });
    }
    public  static void zha(Fruit fruit){
        fruit.zha();
    }
}
