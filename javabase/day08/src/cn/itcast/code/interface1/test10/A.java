package cn.itcast.interface1.test10;

public interface A {
    void mothod();
    void methodA();

    public default void defaultMethod(){
        System.out.println("A");
    }
}
