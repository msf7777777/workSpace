package cn.itcast.code.review.test01;
/*
    Zi类中没有提供构造, 系统赠送了无参空构造, 而无参空构造访问了父类的无参
    而父类没有无参的, 所以报错
    总结: 子类一定要走父类的构造!!!!!!
 */
public class Zi extends Fu {

    public Zi(){
        super(10);
    }
}
