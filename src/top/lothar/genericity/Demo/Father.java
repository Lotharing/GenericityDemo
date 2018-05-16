package top.lothar.genericity.Demo;

public abstract class Father<T , T1> {
	T name;
	public abstract void get(T t);
}
/**
 * 子类声明时指定具体类型
 * 属性类型为具体类型
 * 方法同理
 * @author Lothar
 *
 */
class child1 extends Father<String , Integer>{
	String t;
	@Override
	public void get(String t) {
		// TODO 自动生成的方法存根
		
	}
}
/**
 * 子类泛型类，在使用时确定类型
 * @author Lothar
 *
 * @param <T1>
 * @param <T2>
 */
class child2<T1 , T> extends Father<T,T1>{
	T1 t;
	@Override
	public void get(T t) {
		// TODO 自动生成的方法存根
		
	}
}
/**
 * 父类不指定类型，子类指定泛型，泛型擦除，替换Object
 * @author Lothar
 * @param <T1>
 * @param <T2>
 */
class child3<T1 , T2> extends Father{
	T1 name;
	@Override
	public void get(Object t) {
		// TODO 自动生成的方法存根
		
	}
}
/**
 * 子类父类同时擦除
 * @author Lothar
 *
 */
class child4 extends Father{
	String t;
	@Override
	public void get(Object t) {
		// TODO 自动生成的方法存根
		
	}
	
}