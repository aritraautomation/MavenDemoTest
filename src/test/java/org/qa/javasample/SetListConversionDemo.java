package org.qa.javasample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetListConversionDemo {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("B");
		s.add("A");
		s.add("Z");
		s.add("V");
		s.add("e");
		
		System.out.println(s);
		
		for(String s1:s){
			System.out.println(s1);
		}
		
		List<String> list = new ArrayList<String>(s);
		
		System.out.println(list);
		
		for(String s2:list){
			System.out.println(s2);
		}
		
	}

}
