package cn.itcast.code.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端程序
public class ServerTCP {

    public static void main(String[] args) throws IOException {

        //1. 创建ServerSocket对象。并设置服务器程序的端口号
        ServerSocket ss = new ServerSocket(6666);
        //public Socket accept() ：侦听并接受连接，返回客户端的Socket对象
        //accept() ：  等待客户端程序的连接，当客户端程序连接后，会返回客户端的Socket对象
        //2. 等待客户端连接。当客户端连接后，获取到客户端的Scoket对象
        Socket server = ss.accept();
        //3. 获取输入流（读客户端写入的数据）
        InputStream is = server.getInputStream();

        //4. 从流中读取数据
        byte[] b =new byte[1024]; //存储读取到的字节数据
        int len = is.read(b);//读取1024个字节的数据，并返回实际读取字节的长度

        System.out.println(new String(b,0,len));

        //5. 关闭资源
        is.close();
        server.close();
    }
}
