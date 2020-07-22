package cn.itcast.filter;

import cn.itcast.test.Demo01;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/MessageServlet")
public class NoWordsFilter implements Filter {

    // 声明变量: 保存非法字符串集合
    private List<String> wordList = new ArrayList<String>();

    public void init(FilterConfig config) throws ServletException {
        InputStream in = NoWordsFilter.class.getClassLoader().getResourceAsStream("words.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"))) {
            String line = null;
            while((line=br.readLine())!=null) {
                wordList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(wordList);
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        // 1 获取用户的发帖内容
        String message = req.getParameter("message");
        // 2 遍历非法字符集合
        for (String word : wordList) {
            if(message.contains(word)) {
                // 2.1 判断 如果发帖内容 包含 非法字符, 提示错误,
                response.getWriter().print("<h1 style='color:red'>您的帖子中包含非法字符, 请修正!</h1>");
                response.setHeader("refresh", "5;url=" + request.getContextPath() + "/message.jsp");
                return; // 结束
            }
        }
        // 如果没有包含非法字符, 放行
        chain.doFilter(req, resp);
    }



    public void destroy() {
    }

}
