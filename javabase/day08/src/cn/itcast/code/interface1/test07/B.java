package cn.itcast.interface1.test07;

public interface B {

    public  default  void method(){
        System.out.println("我是B接口的Method");
    }
}
