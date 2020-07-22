package com.itheima.download;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //1. 获取请求参数: fileName
        String fileName = req.getParameter("fileName");
        System.out.println(fileName);

        //2. 要想实现文件下载, 请先设置两个响应头 : 在响应头中,是不能包含中文的, 否则会有问题
        // 要求让浏览器使用下载的方式打开文件
        String agent = req.getHeader("User-Agent");
        String newFile = DownLoadUtils.getFileName(agent, fileName);

        resp.setHeader("Content-Disposition","attachment; filename ="+newFile);
        // 告知浏览器当前是一个什么类型的文件
        String mimeType = this.getServletContext().getMimeType(fileName);
        resp.setHeader("Content-Type",mimeType);

        //3. 要想实现文件下载: 流对接操作
        //3.1: 本地输入流
        InputStream in = this.getServletContext().getResourceAsStream("download/" + fileName);
        //3.2: 响应的字节输出流
        ServletOutputStream out = resp.getOutputStream();

        //3.3: 流对接操作

        byte[] b = new byte[1024];
        int len ;
        while ( (len = in.read(b)) !=-1 ) {
            out.write(b,0,len);
            out.flush(); // 刷新出去
        }

        //4. 释放资源
        in.close();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
