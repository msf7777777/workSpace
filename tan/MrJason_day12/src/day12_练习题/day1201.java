package day12_��ϰ��;
//����һ��Person�ࣨname��age��sno���������ݷ�װ��age�����䷶Χ����Ϊ0-130��ʹ��getAge�������䡣
public class day1201 {
	public static void main(String[] args) {
		Person p = new Person("�ż���", 23, 19960122);
		
		System.out.println("----------��1��----------");
		System.out.println(p.getName());//���ż�����
		System.out.println(p.getAge());//��23��
		System.out.println(p.getSno());//��19960122��
		
		System.out.println("----------��2��----------");
		p.setAge(-1);//���Ƿ��������ݡ�
		System.out.println(p.getAge());//��23��
		
		System.out.println("----------��3��----------");
		p.setName("���ٷ�");
		p.setAge(28);
		p.setSno(19901113);
		System.out.println(p.getName());//�����ٷɡ�
		System.out.println(p.getAge());//��28��
		System.out.println(p.getSno());//��19901113��
		
	}
	
}
