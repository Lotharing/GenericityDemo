package top.lothar.genericity.Demo;

public abstract class Father<T , T1> {
	T name;
	public abstract void get(T t);
}
/**
 * ��������ʱָ����������
 * ��������Ϊ��������
 * ����ͬ��
 * @author Lothar
 *
 */
class child1 extends Father<String , Integer>{
	String t;
	@Override
	public void get(String t) {
		// TODO �Զ����ɵķ������
		
	}
}
/**
 * ���෺���࣬��ʹ��ʱȷ������
 * @author Lothar
 *
 * @param <T1>
 * @param <T2>
 */
class child2<T1 , T> extends Father<T,T1>{
	T1 t;
	@Override
	public void get(T t) {
		// TODO �Զ����ɵķ������
		
	}
}
/**
 * ���಻ָ�����ͣ�����ָ�����ͣ����Ͳ������滻Object
 * @author Lothar
 * @param <T1>
 * @param <T2>
 */
class child3<T1 , T2> extends Father{
	T1 name;
	@Override
	public void get(Object t) {
		// TODO �Զ����ɵķ������
		
	}
}
/**
 * ���ุ��ͬʱ����
 * @author Lothar
 *
 */
class child4 extends Father{
	String t;
	@Override
	public void get(Object t) {
		// TODO �Զ����ɵķ������
		
	}
	
}