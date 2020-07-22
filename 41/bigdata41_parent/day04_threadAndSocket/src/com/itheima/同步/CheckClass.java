package com.itheima.同步;

public class CheckClass {


    public void method1(){
        synchronized (CheckClass.class) {
            System.out.print("i");
            System.out.print("t");
            System.out.print("c");
            System.out.print("a");
            System.out.print("s");
            System.out.print("t");
            System.out.println();
        }

    }

    public synchronized static void method2(){

        System.out.print("i");
        System.out.print("t");
        System.out.print("h");
        System.out.print("e");
        System.out.print("i");
        System.out.print("m");
        System.out.print("a");
        System.out.println();


    }


}
