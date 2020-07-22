package cn.itcast.code.function;

public class Test02 {
    public static void main(String[] args) {
        printHelloWorld();
    }

    public static void printHelloWorld(){
        for (int i = 0; i < 7; i++) {
            System.out.println("HelloWorld! " + (i + 1));
        }
    }
}
