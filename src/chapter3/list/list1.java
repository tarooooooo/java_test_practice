package chapter3.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list1 {
	public static void main(String[] args) {
	List<String> list1 = new ArrayList<String>();
	List<Integer> list2 = new LinkedList<Integer>();
	list1.add("りんご");
	list1.add("みかん");
	list1.add(1,"バナナ");
	list1.contains("バナナ");
	String apple = list1.get(0);
	System.out.println(apple);
	System.out.println(list1.contains("バナナ"));
	System.out.println(list1.contains("ぶどう"));
	list1.add("パイン");
	System.out.println(list1.size());
	list1.remove("パイン");
	System.out.println(list1.size());

	for(String list : list1) {
		System.out.println(list);
	}
	}
}
