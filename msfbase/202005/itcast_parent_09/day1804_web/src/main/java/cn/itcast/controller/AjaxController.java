package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// @ResponseBody 将这个注解放到类, 作用: 给类中每个方法增加 @ResponseBody注解
// @Controller
// @ResponseBody

// @RestController 作用 代替@Controller 和 @ResponseBody
@RestController
@RequestMapping("ajax")
public class AjaxController {

    // 需求:  @ResponseBody 将java对象 转成 json字符串 返回给客户端
    @RequestMapping("testAjax")
    // @ResponseBody
    public List<User> testAjax(User user) {
        System.out.println("==================== 获取数据: user = " + user);

        //准备给客户端浏览器返回的json数据
        User user1 = new User();
        user1.setId(1);
        user1.setName("王五");
        user1.setSex("男");

        User user2 = new User();
        user2.setId(2);
        user2.setName("赵六");
        user2.setSex("女");

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

}
