package com.itheima.聊天程序;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// 客户端
public class ZHANGSANSocket {

    public static void main(String[] args) throws Exception {

        //1. 创建 客户端的socket对象
        Socket socket = new Socket("127.0.0.1", 10000);

        //2. 获取 输入 和 输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //3. 循环的发送数据和接收数据
        //3.1: 构建一个键盘录入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //3.2: 键盘录入数据
            System.out.println("张三请输入:");
            String line = scanner.nextLine();// 读取一行数据

            //3.2: 发送数据
            outputStream.write(line.getBytes());
            outputStream.flush();

            //3.3: 接收数据
            byte[] b = new  byte[2048];
            int len = inputStream.read(b); // 读取的过程中, 如果服务端没有响应回来数据, 此位置会进行阻塞等待

            System.out.println("李四回话:"+new String(b,0,len));

        }

    }

}
