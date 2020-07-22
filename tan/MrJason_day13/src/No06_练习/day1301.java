package No06_Á·Ï°;

public class day1301 {
	public static void main(String[] args) {
		Student zjm = new Student("ÕÅ¼ÎÃô", 23, 19960122, 59);
		zjm.showInfo();
		System.out.println("----------¡¾ÕÅ¼ÎÃô¡¿----------");
		System.out.println(zjm.showInfo());
		System.out.println("----------¡¾ÕÅ¼ÎÃô¡¿----------");
		
		System.out.println();
		
		zjm.fuck();
		System.out.println("----------¡¾ÔüÔüÃô¡¿----------");
		System.out.println(zjm.fuck());
		System.out.println("----------¡¾ÔüÔüÃô¡¿----------");
	}
}
