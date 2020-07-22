package cn.itcast.controller;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkcodeServlet")
public class CheckcodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 需求: 生成验证码
        // 1 生成一个画布对象
        int width = 120;
        int height = 40;
        BufferedImage bufi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 3 从画布上获取画笔
        Graphics g = bufi.getGraphics();

        // 4 填充背景色: 白色
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        // 5 绘制红色边框
        g.setColor(Color.red);
        g.drawRect(0, 0, width -1 , height - 1);

        // 6 在画布上 随机产生4个字符
        // 6.1 准备数据
        String data = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789";
        // 6.2 随机对象
        Random r = new Random();
        // 7.1 准备一个变量保存 验证码的值
        String code = "";

        // 6.3 循环产生4个
        for (int i = 0; i < 4; i++) {
            // 6.3.3 设置随机颜色
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));

            // 6.3.2 设置字体
            g.setFont(new Font("楷体", Font.BOLD, 30));

            // 6.3.1 绘制字符
            // 产生随机索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);

            // 7.2 将生成的验证码字符 追加到 验证码变量中
            code += c + "";

            // 绘制字符串
            g.drawString(c + "", 10 + i * 30, 30);
        }

        // 7 将生成的验证码 打印到控制台
        System.out.println(code);

        // 9 将生成的验证码放到session容器中, 判断 用户输入的验证码是否正确
        request.getSession().setAttribute("code_session", code);

        // 8 绘制干扰线
        for (int i = 0; i < 10; i++) {
            // 设置随机颜色
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));

            g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
        }

        // 2 向画布内容输出给浏览器
        ImageIO.write(bufi, "jpg", response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
