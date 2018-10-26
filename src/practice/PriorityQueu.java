package practice;

import java.util.*;

public class PriorityQueu {

	public static void main(String args[]) {
		PriorityQueue<Integer> i = new PriorityQueue<>();
		PriorityQueue<String> s = new PriorityQueue<>();
		PriorityQueu p =new PriorityQueu();
		
		i.add(2);
		i.add(1);
		i.add(4);
		i.add(5);
		i.add(3);
		
		s.add("A");
		s.add("C");
		s.add("B");
		s.add("D");
		s.add("E");

		for(String item: s) {
			System.out.println(item);
		}
		
	}
}
