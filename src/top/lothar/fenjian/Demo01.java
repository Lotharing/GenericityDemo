package top.lothar.fenjian;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 分拣思路
 * 为所有的key创建容器，存放value值
 * 遇见相同map属性会覆盖，只需把计数器+1
 * @author Lothar
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		String str = "this is a cat and thar is a mice and where is the food";
		//分割字符串,放入字符数组中
		String strArray[] = str.split(" ");
		
		Map<String, Letter> letters = new HashMap<String, Letter>();
		
		for(String temp : strArray){
			if(!letters.containsKey(temp)){
				
				letters.put(temp, new Letter());
				
			}
			//因为key值相同，所以在遇见重复单词时覆盖，并且数值+1记录
			Letter col = letters.get(temp);
			col.setCount(col.getCount()+1);
		}
		
		
		Set<String> keys = letters.keySet();
		
		for(String key : keys){
			Letter col = letters.get(key);
			System.out.println(key+"次数"+col.getCount());
		}
	}
}