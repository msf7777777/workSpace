package cn.itcast.controller;

import cn.itcast.pojo.Item;
import cn.itcast.pojo.QueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {

//    @RequestMapping(value = "/itemList.action", method = RequestMethod.GET)
//    @RequestMapping(value = "/itemList.action", method = RequestMethod.POST)
//    @RequestMapping(value = "/itemList.action", method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/itemList")
    @PostMapping("/itemList")
    public ModelAndView itemList() {
        //模拟假数据Model
        List<Item> modelData = new ArrayList<Item>();
        modelData.add(new Item(1,"华为Mate20",9999,new Date(),"可以挡子弹"));
        modelData.add(new Item(2,"奔驰S650",350,new Date(),"可以看"));
        modelData.add(new Item(3,"挖土机",80,new Date(),"可以开"));
        modelData.add(new Item(4,"小米扫地机器人",3500,new Date(),"可以坐"));
        modelData.add(new Item(5,"小米显示器",599,new Date(),"可以看"));
        modelData.add(new Item(6,"张嘉敏",666666,new Date(),"作麻少飞的老婆"));

        //定义jsp的地址
//        String jspLocation = "/WEB-INF/jsp/itemList.jsp";
        String jspLocation = "itemList";
        //构建 ModelAndWiew
        ModelAndView mv = new ModelAndView();
        mv.addObject("itemList",modelData);
        mv.setViewName(jspLocation);

        // 返回视图
        return mv;
    }


    /***
     * 当用户访问 /itemEdit.action 路径的时候接收参数id，并跳转到 itemEdit.jsp
     */

//    @RequestMapping("/itemEdit.action")
//    public ModelAndView itemEdit(HttpServletRequest request) {
//
//        // 获取id
//        String id = request.getParameter("id");
//
//        // 模拟数据
//        Item item = new Item(1,"华为Mate40",99999,new Date(),"可以挡RPG");
//
//        // 构建mv
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("item", item);
//        mv.setViewName("itemEdit");
//        return mv;
//    }

    @RequestMapping("/itemEdit")
//    public ModelAndView itemEdit(int id) {
    public ModelAndView itemEdit(@RequestParam(value = "id", required = true, defaultValue = "1") int myId) {

        System.out.println("id=" + myId);

        // 模拟数据
        Item item = new Item(1,"麻少飞_修改",7,new Date(),"Fucking");

        // 构建mv
        ModelAndView mv = new ModelAndView();
        mv.addObject("item", item);
        mv.setViewName("itemEdit");
        return mv;
    }

//    @RequestMapping("/updateItem")
//    public ModelAndView updateItem(int id, String name, double price, String detail) {
//        System.out.println("id=" + id);
//        System.out.println("name=" + name);
//        System.out.println("price=" + price);
//        System.out.println("detail=" + detail);
//
//        // 构建mv
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("itemList");
//        return mv;
//    }

    @RequestMapping("/updateItem")
    public ModelAndView updateItem(Item item) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("itemList");
        return mv;
    }

    @RequestMapping("/queryItem")
    public ModelAndView queryItem(QueryVo queryVo, int[] ids) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("itemList");
        return mv;
    }

//    @RequestMapping("/queryItem")
//    public ModelAndView queryItem(int[] ids) {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("itemList");
//        return mv;
//    }

    @RequestMapping("/batchUpdate")
    public  ModelAndView batchUpdate(QueryVo queryVo) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }
}
