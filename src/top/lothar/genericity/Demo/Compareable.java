package top.lothar.genericity.Demo;
/**
 * 和继承同一原理
 * @author Lothar
 *
 * @param <T>
 */
public interface Compareable<T> {
	void compare(T t);
}
/**
 *泛型擦除
 */
class one implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}
//子类泛型>=父类泛型
class two<T> implements Comparable<T>{

	@Override
	public int compareTo(T o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}
//父类擦除，子类泛型
class three<T> implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
	
}
