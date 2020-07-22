package com.itheima.网络编程;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// socket的服务端
public class SocketServer {

    public static void main(String[] args) throws Exception{
        //1. 创建scoket服务端的对象的实例
        ServerSocket serverSocket = new ServerSocket(10010);
        System.out.println("111111");
        //2. 开始监听是否有客户端连接服务器,
        Socket socket = serverSocket.accept(); // 当没有客户端连接的时候, 此步操作会进行阻塞
        System.out.println("222222");
        //3. 从socket对象中获取输入流 和 输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        //4. 先来接收数据
        byte[] b = new byte[2048];
        int len = inputStream.read(b);

        System.out.println("客户端:"+ new String(b,0,len));

        //5. 给客户端进行响应操作

        outputStream.write("哥们, 我是服务端, 我已经接收到了, 我在.....".getBytes());
        outputStream.flush();

        //6. 释放资源
        outputStream.close();
        inputStream.close();

    }
}
