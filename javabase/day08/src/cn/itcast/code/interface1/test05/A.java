package cn.itcast.interface1.test05;

public interface A {

    void method();
    //jdk1.8防止接口升级, 变化太大, 修改的类太多, 定义出了默认方法
    //void  method1();
    /*
        默认方法的格式:
        public default 返回值类型 方法名(参数列表){

        }

     */
    public default  void method1(){
        System.out.println("升级后添加的默认方法");
    }
}
