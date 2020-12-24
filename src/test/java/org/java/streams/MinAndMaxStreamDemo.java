package org.java.streams;

import java.util.ArrayList;

public class MinAndMaxStreamDemo {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(9);
		l.add(0);
		l.add(22);
		l.add(5);
		l.add(2);
		
		int min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum element: " +  min);
		
		int max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum element: " +  max);
		
		System.out.println("Using Method Reference Expression:");
		l.stream().forEach(System.out::println);
		
		System.out.println("Using Lambda Expression:");
		l.stream().forEach(i->System.out.println(i));
	}

}
