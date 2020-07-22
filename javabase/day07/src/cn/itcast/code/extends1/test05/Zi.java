package cn.itcast.code.extends1.test05;

public class Zi extends Fu {
    @Override//帮助我们检查是否正确重写, 如果没有写这个注解, 满足重写的条件,依然是重写
    public void method(){
        System.out.println("Zi");
    }

    private void method(int num){
        System.out.println("Fu");
    }
}
