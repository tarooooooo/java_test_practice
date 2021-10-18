package chapter4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class practice {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(0);
		set.add(1);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "char1");
		map.put(2, "char2");
		String value = map.get(0);
	}
}
