package cn.itcast.code.function_practise;

public class Test05 {
    public static void main(String[] args) {
        int calc = calc(10,9,0);
        System.out.println(calc);
        int calc1 = calc(10,9,2);
        System.out.println(calc1);
    }

    public static int calc(int a, int b, int type) {
        switch(type){
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
            default:
                return 0;
        }
    }
}
