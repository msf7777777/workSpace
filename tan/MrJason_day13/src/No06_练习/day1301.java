package No06_��ϰ;

public class day1301 {
	public static void main(String[] args) {
		Student zjm = new Student("�ż���", 23, 19960122, 59);
		zjm.showInfo();
		System.out.println("----------���ż�����----------");
		System.out.println(zjm.showInfo());
		System.out.println("----------���ż�����----------");
		
		System.out.println();
		
		zjm.fuck();
		System.out.println("----------����������----------");
		System.out.println(zjm.fuck());
		System.out.println("----------����������----------");
	}
}
