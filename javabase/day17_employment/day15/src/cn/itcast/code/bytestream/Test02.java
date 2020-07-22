package cn.itcast.code.bytestream;

import java.io.*;

/*

 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        //1.输入流 --->源
        FileInputStream fis = new FileInputStream("d://a.avi");
        //2.输出流 --->目的
        FileOutputStream fos = new FileOutputStream("e://a.avi");
        //3.多个多个的拷贝
        long start = System.currentTimeMillis();
        byte[] arr = new byte[1024*8]; //定义容器来装载数据
        int len; //专门用来记录本次读取的有效个数
        while((len = fis.read(arr))!=-1){
            //将读到的数据写到目的地中
            fos.write(arr,0,len);//防止最后一次有可能读不满的情况
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //4.释放资源
        fis.close();
        fos.close();
        //39000
    }
}
