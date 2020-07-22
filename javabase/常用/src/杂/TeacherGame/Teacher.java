package 杂.TeacherGame;

public class Teacher {
    //属性:name, age, gender
    String name;
    String gender;
    final int age = 18;
    public void teachKnowledge(String teach) {
        System.out.println("看来你是一个努力的孩子!加油哦!");
    }
    public void teachDriveing(String teach) {
        System.out.println("是的,这是梅老师特殊技能!大家加油学习!");
    }
}
