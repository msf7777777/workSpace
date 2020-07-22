package No06_练习;
/*
编写一个Person类，包括属性（name、age），
有参构造器、方法say(返回自我介绍的字符串）。 
编写一个Student类，继承Person类，增加sno、score属性，
以及有参构造器，在子类中调用父类的构造器。
*/
public class Student extends Person {
	private int sno;
	private int score;
	
	public Student(String name, int age, int sno, int score) {
		super(name, age);
		this.sno = sno;
		this.score = score;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String showInfo() {
		return super.say() + "我的学号是：" + sno + "\n"
	                       + "我的分数是" + score + "\n"
	                       + "我想我应该没及格" + "\n"
	                       + "因为我就是个渣渣";
	}
	
	public String fuck() {
		return super.fuck() + "我" + super.nameZjm() + "总是欺负麻少飞" + "\n"
                            + "因为我" + super.nameZjm() + "就是个渣渣";
	}
	
}
