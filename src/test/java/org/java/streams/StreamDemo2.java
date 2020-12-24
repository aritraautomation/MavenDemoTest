package org.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Ayush");
		l.add("Ravi Sharma");
		l.add("Peter England");
		l.add("Brad Pit");
		
		
		System.out.println("Before Sorting: " + l);
		
		//Default Natural Sorting order-one way
		List<String> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order : " + l1);
		
		//Default Natural Sorting order-another way
		List<String> l2 = l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Another way of Default Natural Sorting Order : " + l2);
		
		//reverse Default Natural Sorting order-1st way
		List<String> l3 = l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("1st way of reverse Default Natural Sorting Order : " + l3);
				
		//Default Natural Sorting order-2nd way
		List<String> l4 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("2nd way of reverse Default Natural Sorting Order : " + l4);
		
		//Sorting according to increasing length:
		Comparator<String> c = (s1,s2)->{
			int len1=s1.length();
			int len2=s2.length();
			if(len1<len2) return -1;
			else if(len1>len2) return 1;
			else return s1.compareTo(s2);
		};
		
		List<String> l5 = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorting according to increasing length : " + l5);
		
		//sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
		//sorted((s1,s2)->(s1<s2)?1:(s1>s2)?-1:0)
		
	}

}
