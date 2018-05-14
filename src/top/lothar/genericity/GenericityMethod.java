package top.lothar.genericity;

import java.io.Closeable;
import java.io.IOException;
/**
 * 泛型方法  返回类型前面
 * 只能访问对象信息，不能修改信息，因为类型已经制定后只能访问
 * @author Lothar
 *
 */
public class GenericityMethod {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
