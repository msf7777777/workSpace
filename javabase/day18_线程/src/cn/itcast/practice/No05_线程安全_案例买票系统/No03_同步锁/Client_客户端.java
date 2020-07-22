package cn.itcast.practice.No05_线程安全_案例买票系统.No03_同步锁;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client_客户端 {
    public static void main(String[] args) throws IOException {
        //1. 创建客户端Socket对象，并连接服务端程序（借助端口号去找到服务端程序）
        //public Socket(String 服务器的IP, int 服务器程序端口号)
        Socket clientSocket = new Socket("127.0.0.1", 7777);
        //2. 基于客户端获取输出流
        OutputStream outputStream = clientSocket.getOutputStream();//使用流向服务器写数据
        //3. 使用输出流，向服务器写入数据（数据交互）
        outputStream.write("你好!我是客户端".getBytes());
        /* =====================接收服务端回写的数据====================== */
        //4. 基于客户端对象，获取输入流（读取服务端发送的数据）
        InputStream inputStream = clientSocket.getInputStream();
        //5. 从输入流中读取数据
        byte[] b = new byte[8 * 1024];
        int len = inputStream.read(b);
        System.out.println("服务器回复:" + new String(b,0,len));
        //6. 关闭资源
        inputStream.close();
        outputStream.close();
        clientSocket.close();
    }
}
