package com.itheima.web;

import com.itheima.service.AccountService;
import com.itheima.service.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1.设置编码
         * 2.获取参数
         * 3.创建AccountService
         * 4.调用service的transfer方法
         * 5.页面跳转账完毕的页面
         */
        //1.设置编码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //2.获取参数
        String inName = request.getParameter("inName");
        String outName = request.getParameter("outName");
        String moneyStr = request.getParameter("money");

        //转型money为double类型
        double money = 0.0;
        if(moneyStr != null && !moneyStr.trim().equals("")){
            money = Double.parseDouble(moneyStr);
        }
        //3.创建AccountService
        AccountService service = new AccountServiceImpl();
        //4.调用service的transfer方法
        service.transfer(inName,outName,money);
        //5.页面跳转账完毕的页面
        request.getRequestDispatcher("success.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
