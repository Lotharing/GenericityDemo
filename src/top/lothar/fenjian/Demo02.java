package top.lothar.fenjian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo02 {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		exam(list);
		//统计
		Map<String, ClassRoom> rooms = new HashMap<String, ClassRoom>();
		count(rooms, list);
		
		printScore(rooms);
	}
	
	public static void printScore(Map<String, ClassRoom> rooms){
		Set<Map.Entry<String, ClassRoom>> entrySet = rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>> it = entrySet.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, ClassRoom> entry = it.next();
			ClassRoom room = entry.getValue();
			double avg =room.getTotal()/room.getStus().size();
			System.out.println(room.getNo()+"  "+room. getTotal()+"  "+avg);
		}
	}
	
	
	public static void count(Map<String,ClassRoom> rooms ,List<Student> list){
		for(Student stu : list){
			String no = stu.getNo();
			double score = stu.getScore();
			//根据班级编号，查询map中是否存在该班级 分拣思路
			ClassRoom room = rooms.get(no);
			if(null==room){
				room = new ClassRoom(no);
				rooms.put(no, room);
			}
			//储存总分，加入学生
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);
		}
	}
	/**
	 * 学生对象放进list，包括name no score
	 * @param list
	 */
	public static void exam(List<Student> list){
		list.add(new Student("a", "001", 80));
		list.add(new Student("b", "001", 80));
		list.add(new Student("c", "002", 90));
		list.add(new Student("d", "002", 90));
		list.add(new Student("e", "003", 100));
		list.add(new Student("f", "003", 100));
	}
}
