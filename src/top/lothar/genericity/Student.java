package top.lothar.genericity;
/**
 * 1.�����࣬����ʱʹ�÷���
 * 2.��ĸ��T��ʾType    K V��ʾ��ֵ��         E��ʾElement
 * 3.ʹ�ø÷�����ʱָ������
 * ע��     1.����ֻ��ʹ���������ͣ�����ʹ�û�������(int,double ...)
 * 	    2.����ʹ��ʱ����ʹ�ó�������̬����|��̬����  ��Ϊ������� ��̬�Ļ���û��ָ������ʱ���뱨��
 * @author Lothar
 *
 * @param <T1>
 * @param <T2>
 */
public class Student<T1 ,T2> {
	
	private T1 javaseScore;
	private T2 oracleScore;
	
	
	public T1 getJavaseScore() {
		return javaseScore;
	}


	public void setJavaseScore(T1 javaseScore) {
		this.javaseScore = javaseScore;
	}


	public T2 getOracleScore() {
		return oracleScore;
	}


	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}


	public static void main(String[] args) {
		// ʹ��ʱָ�����ͣ����ö���ʱ�����󴴽����Ƿ���
		Student<String , Integer> stu = new Student<String , Integer>(); 
		//��ȫ:���ͼ��
		stu.setJavaseScore("����");
		//ʡ��:����ת��
		String str = stu.getJavaseScore();
		
		System.out.println(str);
	}

}
