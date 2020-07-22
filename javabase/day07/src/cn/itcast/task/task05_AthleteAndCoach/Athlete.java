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
public class Athlete extends Human {
    //1.继承父类抽象方法并定义
    @Override
    public void eat() {
        System.out.println(getName() + getAge() + getGender() + getId() + "是运动员,吃营养餐");
    }

    //2.定义运动员独有属性(班级)
    private int classId;

    //3.构造无参&有参函数
    public Athlete() {
    }
    public Athlete(int id, String name, char gender, int age, int classId) {
        super(id, name, gender, age);
        this.classId = classId;
    }
}
