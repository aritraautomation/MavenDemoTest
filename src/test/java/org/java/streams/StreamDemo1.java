package org.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(13);
		l.add(7);
		l.add(20);
		l.add(30);*/
		
		List<Integer> l = Arrays.asList(0,10,40,3,62,11);
		
		System.out.println(l);
		
		List<Integer> l1 = l.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		List l2 = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l2);
		
		long noOfFailedStuendts = l.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStuendts);
		
		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> customizedSortedList1 = l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order : "+ customizedSortedList1);
		
		List<Integer> customizedSortedList = l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(customizedSortedList);
		
		List<Integer> customizedSortedList2 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Reverse Default Natural Sorting Order : "+ customizedSortedList2);
		
		
	}

}
