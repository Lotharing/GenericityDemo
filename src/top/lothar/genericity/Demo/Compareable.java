package top.lothar.genericity.Demo;
/**
 * �ͼ̳�ͬһԭ��
 * @author Lothar
 *
 * @param <T>
 */
public interface Compareable<T> {
	void compare(T t);
}
/**
 *���Ͳ���
 */
class one implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		return 0;
	}
}
//���෺��>=���෺��
class two<T> implements Comparable<T>{

	@Override
	public int compareTo(T o) {
		// TODO �Զ����ɵķ������
		return 0;
	}
}
//������������෺��
class three<T> implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	
}
