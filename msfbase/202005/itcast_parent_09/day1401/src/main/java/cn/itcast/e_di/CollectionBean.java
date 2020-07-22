package cn.itcast.e_di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
    // 声明集合属性
    private List<String> list1;
    private Set<String> set1;
    private Map<String, String> map1;
    private Properties props1;

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public void setMap1(Map<String, String> map1) {
        this.map1 = map1;
    }

    public void setProps1(Properties props1) {
        this.props1 = props1;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "list1=" + list1 +
                ", set1=" + set1 +
                ", map1=" + map1 +
                ", props1=" + props1 +
                '}';
    }
}
