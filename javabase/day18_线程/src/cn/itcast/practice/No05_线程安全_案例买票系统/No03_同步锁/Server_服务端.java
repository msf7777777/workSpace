package cn.itcast.practice.No05_线程安全_案例买票系统.No03_同步锁;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端程序
public class Server_服务端 {
    public static void main(String[] args) throws IOException {
        //1. 创建ServerSocket对象。并设置服务器程序的端口号
        ServerSocket serverServerSocket = new ServerSocket(7777);
        //public Socket accept() ：侦听并接受连接，返回客户端的Socket对象
        //accept() ：  等待客户端程序的连接，当客户端程序连接后，会返回客户端的Socket对象
        //2. 等待客户端连接。当客户端连接后，获取到客户端的Scoket对象
        Socket socketServer = serverServerSocket.accept();
        //3. 获取输入流（读客户端写入的数据）
        InputStream inputStream = socketServer.getInputStream();
        //4. 从流中读取数据
        byte[] b = new byte[8 * 1024];//存储读取到的字节数据
        int len = inputStream.read(b);//读取1024个字节的数据，并返回实际读取字节的长度
        System.out.println("客户端回复:" + new String(b,0,len));
        /* ========================回写数据给客户端=========================== */
        //5. 获取输入流对象（向客户端回写数据）
        OutputStream outputStream = socketServer.getOutputStream();
        //6. 回写数据
        outputStream.write("你好!我是服务器".getBytes());
        //7. 关闭资源
        outputStream.close();
        inputStream.close();
        serverServerSocket.close();
    }
}
