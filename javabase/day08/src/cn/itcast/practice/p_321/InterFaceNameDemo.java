package cn.itcast.practice.p_321;

public interface InterFaceNameDemo extends InterFaceName {



    public static void main(String[] args) {
        //★★★不懂为什么不能new
//        InterFaceNameDemo interFaceNameDemo = new InterFaceNameDemo();
//        interFaceNameDemo.method();
        //★★★不懂为什么new不出来也不能输出
//        System.out.println(interFaceNameDemo.getClass());
        InterFaceName.method2();
        //★★★不懂为什么不能赋值参数
//        InterFaceName.method(1);
    }
}
