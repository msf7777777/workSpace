package com.itheima.网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// 这是客户端程序
public class SocketClient {

    public static void main(String[] args) throws Exception {

        //1. 创建客户端的socket对象实例 : 指定将数据发送给那个地址 以及端口号
        Socket socket = new Socket("127.0.0.1",10010);

        //2. 从scoket中获取输入和 输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //3. 发送数据
        outputStream.write("你好呀, 俺是客户端 , 你在不在呀???".getBytes());
        outputStream.flush();// 确保数据可以刷新过去
        //4. 接收数据
        byte[] b  =  new byte[2048];
        int len = inputStream.read(b);

        System.out.println("服务端:"+new String(b,0,len));

        //5. 释放资源
        inputStream.close();
        outputStream.close();

    }
}
