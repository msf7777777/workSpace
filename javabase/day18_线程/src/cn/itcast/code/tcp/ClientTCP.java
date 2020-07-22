package cn.itcast.code.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        //1. 创建客户端Socket对象，并连接服务端程序（借助端口号去找到服务端程序）
        //public Socket(String 服务器的IP, int 服务器程序端口号)
        Socket client = new Socket("127.0.0.1",6666);
        //2. 基于客户端获取输出流
        OutputStream os = client.getOutputStream();//使用流向服务器写数据

        //3. 使用输出流，向服务器写入数据（数据交互）
        os.write("你好吧?".getBytes());

        //4. 关闭资源
        os.close();
        client.close();
    }
}
