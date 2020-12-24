package org.qa.java8Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionUsingLambda {

	public static void main(String[] args) {
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(2);
		l.add(22);
		l.add(30);
		l.add(25);
		l.add(10);
		
		System.out.println("Before sorting : " + l);
		
		Collections.sort(l,c);
		
		System.out.println("After sorting as Ascending Order : " + l);
		
		l.stream().forEach(System.out::println);

	}

}
