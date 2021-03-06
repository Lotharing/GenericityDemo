package top.lothar.genericity.Demo;
/**
 * 1.泛型类，声明时使用泛型
 * 2.字母：T表示Type    K V表示键值对         E表示Element
 * 3.使用该泛型类时指定类型
 * 注意     1.泛型只能使用引用类型，不能使用基本类型(int,double ...)
 * 	    2.泛型使用时不能使用常量，静态属性|静态方法  因为编译机制 静态的会在没有指定类型时编译报错
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
		// 使用时指定类型，引用对象时，对象创建的是泛型
		Student stu = new Student(); 
		//安全:类型检查
		stu.setJavaseScore("优秀");
		//省心:类型转换
		String str = (String)stu.getJavaseScore();
		
		System.out.println(str);
		
		
	}
	
	public static void test(Student<Integer> a){
		
	}
	
	public static void test1(Student<?> a){
		
	}
}
