package cn.itcast.pojo;

import lombok.Data;

import java.util.Map;

// queryVo : query value object, 作用: 封装 查询条件的 对象,
// 查询条件特点: 随着时间不断变化
@Data
public class QueryVoMap {

    private Map<String, User> userMap;

}
