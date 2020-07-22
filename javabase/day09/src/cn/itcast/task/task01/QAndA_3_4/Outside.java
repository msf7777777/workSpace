package cn.itcast.task.task01.QAndA_3_4;

//3.4 请问下面横线处分别填写什么代码，才能实现打印：

public class Outside {
    public void show(){
        int a = 10;
        class Inside{
            public void show(){
                System.out.println("a = " + a);//10
            }

            public Inside() {
            }
        }
        Inside inside = new Inside();
        inside.show();
    }

    public static void main(String[] args) {
        Outside outside = new Outside();
        outside.show();
    }

    //外部构造函数
    public Outside() {
    }
}
