package cn.itcast.pojo;

import lombok.Data;

import java.util.List;

// queryVo : query value object, 作用: 封装 查询条件的 对象,
// 查询条件特点: 随着时间不断变化
@Data
public class QueryVo {

    private User user;
//    private List<User> userList;//可打开

}
