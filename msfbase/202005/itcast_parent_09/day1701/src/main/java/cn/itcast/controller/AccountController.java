package cn.itcast.controller;

import cn.itcast.servcie.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 将当前类交给spring管理
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/zhuanzhang/{outAccount}/{inAccount}/{money}")
    public ModelAndView zhuanzhuan(@PathVariable("outAccount") String outAccount,
                                   @PathVariable("inAccount") String inAccount,
                                   @PathVariable("money") int money) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");

        // 调用业务层 处理转账业务
        accountService.zhuanzhang(outAccount, inAccount, money);

        mv.addObject("msg", "成功: " + outAccount + "给" + inAccount + "转账" + money + "元!");
        return mv;
    }

}
