package cn.itcast.task.task01.QAndA_3_5;

//3.5 请按要求填写代码：

public class Test {
    public static void main(String[] args){
        Animal animalZi = new AnimalZi();
        fun(new AnimalZi());//请用子类的形式调用
      //fun();//请用匿名内部类的形式调用
        fun(new Animal(){
            @Override
            public void show() {
                System.out.println("匿名重写测试成功");
            }
        });

    }
    public static void fun(Animal a ){
        a.show();
    }
}
