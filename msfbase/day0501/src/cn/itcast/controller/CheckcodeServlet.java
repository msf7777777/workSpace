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

@WebServlet("/CheckcodeServlet")
public class CheckcodeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 需求: 生成一张验证码图片
        // 1 创建画布对象
        int width = 120;
        int height = 40;
        BufferedImage bufi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 3 获取画笔
        Graphics g = bufi.getGraphics();

        // 4 填充背景色
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        // 5 绘制边框
        g.setColor(Color.red);
        g.drawRect(0, 0, width-1, height-1);

        // 6 生成4个随机字符
        // 6.1 准备数据
        String data = "ABCDEFGHJKMNPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz23456789";
        // 6.2 准备随机对象
        Random r = new Random();
        // 6.3 生成4个随机字符
        // 7.1 声明验证码变量
        String code = "";
        for (int i = 0; i < 4; i++) {
            // 设置字体
            g.setFont(new Font("楷体", Font.BOLD, 30));
            // 设置画笔的随机颜色
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            // 绘制字符
            String str = data.charAt(r.nextInt(data.length())) + "";
            g.drawString(str, 10 + 30 * i, 30);

            // 7.2 将生成的字符追加到 验证码变量中
            code += str;
        }

        // 7 把生成的验证码打印到控制台(后台)
        System.out.println("生成的验证码: " + code);

        // 8 绘制若干条干扰线
        for (int i = 0; i < 5; i++) {
            // 设置画笔的随机颜色
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));

            g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
        }

        // 2 将画布输出给浏览器
        ImageIO.write(bufi, "jpg", response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}