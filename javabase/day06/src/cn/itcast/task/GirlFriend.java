package cn.itcast.task;
/*
6. 定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。
   行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
   请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。
   打印效果如下：
        我女朋友叫凤姐,身高155.0厘米,体重130.0斤
		女朋友帮我洗衣服
		女朋友给我做饭
 */
public class GirlFriend {
    //构造函数
    public GirlFriend() {
    }

    //属性
    private String name;
    private double height;
    private double weight;
    //行为1:洗衣服
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    //行为2:做饭
    public void cook(){
        System.out.println("女朋友给我做饭");
    }

    //有参函数
    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //提供Getter and Setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
