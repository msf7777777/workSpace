package cn.itcast.interface1.test10;

public interface B {
    void mothod();
    void methodB();

    public default void defaultMethod(){
        System.out.println("B");
    }
}
