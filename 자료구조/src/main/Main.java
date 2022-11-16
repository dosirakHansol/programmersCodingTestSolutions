package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		MyList list = new MyList();
		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println("1번째 인덱스는? :::" + list.get(1));
		
		System.out.println("지우기전 list의 사이즈 :::" + list.size());
		
		list.prinInfo();
		
		list.remove(3);
		
		System.out.println("지우고후 list의 사이즈 :::" + list.size());
		
		list.prinInfo();
		
		System.out.println(list);
		
	}

}
