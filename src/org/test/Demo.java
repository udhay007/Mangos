package org.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		 System.out.println("has next");
	   while (listIterator.hasNext()) {
		Integer integer = (Integer) listIterator.next();
		System.out.println(integer);
		
	}
	   System.out.println("has previous");
	   while (listIterator.hasPrevious()) {
		Integer integer = (Integer) listIterator.previous();
		System.out.println(integer);
		
		if (integer==200) {
			listIterator.remove();
		}
	}
	   System.out.println(l);
}
		
		
		
		
	}
	


