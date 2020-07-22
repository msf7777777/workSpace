package cn.itcast.code.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    一次读多个字节的方法
        - `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
        一次读一个字节数组的返回值, 返回的是本次读取的有效个数,为了防止最后一次读不满的情况准备的

        总结:
           1. public int read(byte[] b) 一次可以读取多个字节, 返回值是读取的有效个数, 当返回-1的
            时候证明读到了末尾
           2. 字节数组的大小一般都是1024或者1024的整数倍  1024*8 ---> 8kb

 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        //创建输出流关联文件
        FileInputStream fis = new FileInputStream("d:/a.txt");
        //- `public int read(byte[] b)`：
        //准备一个篮子, 好让一次读多个
        byte[] arr = new byte[1024];
        int count; //记录读取的有效长度
        while((count = fis.read(arr))!=-1){
            System.out.println(new String(arr,0,count));
        }

        //释放资源
        fis.close();


        /*byte[] arr = new byte[2];
        while (true){
            int len = fis.read(arr);
            if(len == -1){//返回有效长度,如果是-1证明没有数据了
                break;
            }
            System.out.println(new String(arr,0,len));//要防止最后一个读不满的情况
        }*/




       /* byte[] arr = new byte[2];
        int read = fis.read(arr);//将数据读到数组中
        System.out.println(read);
        System.out.println(new String(arr));
        //System.out.println(arr[0]+","+ arr[1]);


        read = fis.read(arr);//将数据读到数组中
        System.out.println(read);
        System.out.println(new String(arr,0,read));//将arr中读取的有效个数转成字符串
        //System.out.println(arr[0]+","+ arr[1]);


        read = fis.read(arr);//将数据读到数组中
        System.out.println(read);
        System.out.println(new String(arr,0,read));//将arr中读取的有效个数转成字符串
        //System.out.println(arr[0]+","+ arr[1]);

        read = fis.read(arr);//将数据读到数组中
        System.out.println(read);
        System.out.println(new String(arr,0,read));//将arr中读取的有效个数转成字符串
        //System.out.println(arr[0]+","+ arr[1]);*/


    }
}
