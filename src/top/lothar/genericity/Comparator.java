package top.lothar.genericity;
/**
 * 接口中泛型字母只能使用在方法中，不能使用在全局变量中
 * 编译机制问题，常量不能用泛型
 * @author Lothar
 *
 * @param <T>
 */
public interface Comparator<T> {
	
	void  comparator(T t);
}
