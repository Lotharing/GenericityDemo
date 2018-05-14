package top.lothar.genericity;

import java.io.Closeable;
import java.io.IOException;
/**
 * ���ͷ���  ��������ǰ��
 * ֻ�ܷ��ʶ�����Ϣ�������޸���Ϣ����Ϊ�����Ѿ��ƶ���ֻ�ܷ���
 * @author Lothar
 *
 */
public class GenericityMethod {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		test("123");
	}
	
	public static <T> void test(T a){
		System.out.println(a);
	}
	
	public static <T extends Closeable> void test(T... a){
		for(T temp : a){
			try {
				if(temp!=null){
					temp.close();
				}	
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
