package No03_�̳�;

//java��ͨ���̳�һ���࣬���̳д�������й��ܡ�
//java�е�ÿһ���඼�̳���Object��
//������һ����ʱ�����Զ��ļ̳�Object������з�����
//java�������඼�̳���Object��
//��F�̳���Object
class F{
	
}
public class day1204 {
	public static void main(String[] args) {
		//ctrl + shift + t��һ������
		//ctrl + o ������б���Ϣ(���Ժͷ���)
		F f = new F();
		//toString�����̳���Object
		System.out.println(f.toString());//F��Ϊ�ַ����������
		//hashCode�����̳���Object
		//hashCode�����Ǳ��ط�����û�з�����
		//native��������õײ��c���Եĺ���
		//hashCode���������ض���Ĺ�ϣ��
		System.out.println(f.hashCode());
		//instanceof�ؼ��������ж�һ�������Ƿ����������
		//f��F���ʵ��
		System.out.println(f instanceof F);//true��С���ǲ��鶯��
		//f��Object���ʵ��
		System.out.println(f instanceof Object);//true��С���Ƕ���
		//���Object��
		//���鶯�F����f��ĳһֻ����Ĳ��鶯��ҼҵĹ�--С�ڣ�
		//����
	}
}
