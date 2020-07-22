package cn.itcast.task.task05_AthleteAndCoach;
/*
5.
	我们计划为一所体育学校设计一套系统，需要记录以下人员的信息：
	教练员：
		属性：员工编号、姓名、性别、年龄
		行为：吃饭(吃工作餐)
	运动员：
		属性：学员编号、姓名、性别、年龄、所在班级
		行为：吃饭(吃营养餐)
	请根据需求，设计、并编码实现：
	    父类“人员类”，子类“教练员类”、子类“运动员类”，并包含
	共有的属性和行为的定义
	    由于运动员和教练员的吃饭的内容不同，所以需要设计为“抽象方法”。
 */
public class TestAthleteAndCoach {
    public static void main(String[] args) {
        //1.创建Coach对象测试类中方法
        Coach coach = new Coach(630828, "麻教练", '男', 47);//参数代入方法创建Coach对象
        coach.eat();//Coach类继承父类抽象方法eat输出

        //2.创建Athlete对象测试类中方法
        Athlete athlete = new Athlete();//无参方法创建Athlete对象
        athlete.setId(901113);//set方法设置参数id
        athlete.setName("麻少飞");//set方法设置参数name
        athlete.setGender('男');//set方法设置参数gender
        athlete.setAge(29);//set方法设置参数age
        athlete.eat();
    }
}
