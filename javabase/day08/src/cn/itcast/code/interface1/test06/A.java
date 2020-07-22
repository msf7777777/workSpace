package cn.itcast.interface1.test06;

public interface A  {


    public  default  void method(){
        System.out.println("我是接口的Method");
    }
}
