package top.lothar.genericity.Demo;
/**
 * 1.�����࣬����ʱʹ�÷���
 * 2.��ĸ��T��ʾType    K V��ʾ��ֵ��         E��ʾElement
 * 3.ʹ�ø÷�����ʱָ������
 * ע��     1.����ֻ��ʹ���������ͣ�����ʹ�û�������(int,double ...)
 * 	    2.����ʹ��ʱ����ʹ�ó�������̬����|��̬����  ��Ϊ������� ��̬�Ļ���û��ָ������ʱ���뱨��
 * @author Lothar
 *
 * @param <T1>
 */
public class Student<T1> {
	
	private T1 javaseScore ,oracleScore;
	
	
	
	public T1 getJavaseScore() {
		return javaseScore;
	}


	public void setJavaseScore(T1 javaseScore) {
		this.javaseScore = javaseScore;
	}


	public T1 getOracleScore() {
		return oracleScore;
	}


	public void setOracleScore(T1 oracleScore) {
		this.oracleScore = oracleScore;
	}


	public static void main(String[] args) {
		// ʹ��ʱָ�����ͣ����ö���ʱ�����󴴽����Ƿ���
		Student stu = new Student(); 
		//��ȫ:���ͼ��
		stu.setJavaseScore("����");
		//ʡ��:����ת��
		String str = (String)stu.getJavaseScore();
		
		System.out.println(str);
		
		
	}
	
	public static void test(Student<Integer> a){
		
	}
	
	public static void test1(Student<?> a){
		
	}
}
