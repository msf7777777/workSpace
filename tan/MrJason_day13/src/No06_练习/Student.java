package No06_��ϰ;
/*
��дһ��Person�࣬�������ԣ�name��age����
�вι�����������say(�������ҽ��ܵ��ַ������� 
��дһ��Student�࣬�̳�Person�࣬����sno��score���ԣ�
�Լ��вι��������������е��ø���Ĺ�������
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
		return super.say() + "�ҵ�ѧ���ǣ�" + sno + "\n"
	                       + "�ҵķ�����" + score + "\n"
	                       + "������Ӧ��û����" + "\n"
	                       + "��Ϊ�Ҿ��Ǹ�����";
	}
	
	public String fuck() {
		return super.fuck() + "��" + super.nameZjm() + "�����۸����ٷ�" + "\n"
                            + "��Ϊ��" + super.nameZjm() + "���Ǹ�����";
	}
	
}
