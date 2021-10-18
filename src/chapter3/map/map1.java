package chapter3.map;

import java.util.HashMap;
import java.util.Map;

public class map1 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0,"ぶどう");
		map1.put(1,"もも");
		map1.put(0, "アボカド");
		System.out.println(map1.get(2));
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("アボカド"));
		System.out.println(map1.size());
		map1.remove(1,"もも");
		System.out.println(map1.size());
	}
	
}
