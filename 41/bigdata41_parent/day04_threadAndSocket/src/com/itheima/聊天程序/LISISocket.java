package com.itheima.聊天程序;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务端
public class LISISocket {

    public static void main(String[] args) throws Exception {
        //1. 创建socket的服务端的对象
        ServerSocket serverSocket = new ServerSocket(10000);

        //2. 监听客户端的连接操作
        System.out.println("1111");
        Socket socket= serverSocket.accept();
        System.out.println("2222");
        //3. 获取输入 和输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //4. 循环接收数据 和 发送数据
        //4.2: 创建一个键盘录入对象的实例
        Scanner scanner = new Scanner(System.in);

        while(true){
            //4.1: 接收数据的操作
            byte[] b = new byte[2048];
            int len = inputStream.read(b);
            System.out.println("张三回应:"+new String(b,0,len));


            //4.2 : 进行键盘录入操作
            System.out.println("李四请输入:");
            String line = scanner.nextLine();

            //4.3: 发送数据操作
            outputStream.write(line.getBytes());
            outputStream.flush();

        }


    }

}
