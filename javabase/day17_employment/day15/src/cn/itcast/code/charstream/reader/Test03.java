package cn.itcast.code.charstream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
    总结:
        一次读一个字符
        一次读多个字符
 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d://b.txt");
        char[] arr = new char[2];

        int len;
        while((len = fr.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
        //释放资源
        fr.close();

        /*while (true){
            int len = fr.read(arr);
            if(len ==-1){
                break;
            }
            System.out.println(new String(arr,0,len));
        }*/



        /*System.out.println(len);
        System.out.println(arr[0]+","+ arr[1]);

        len = fr.read(arr);
        System.out.println(len);
        System.out.println(arr[0]+","+ arr[1]);


        len = fr.read(arr);
        System.out.println(len);
        System.out.println(arr[0]+","+ arr[1]);

        len = fr.read(arr);
        System.out.println(len);
        System.out.println(arr[0]+","+ arr[1]);*/
    }
}
