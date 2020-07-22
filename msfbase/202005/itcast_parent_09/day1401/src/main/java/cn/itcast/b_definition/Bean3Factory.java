package cn.itcast.b_definition;

public class Bean3Factory {

    /**
     * 通过非静态方法获取bean3
     * @return
     */
    public Bean3 getBean3() {
        return new Bean3();
    }
}
