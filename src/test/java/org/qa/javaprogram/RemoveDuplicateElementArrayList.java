package org.qa.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicateElementArrayList {	

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,10,40));
		
		ArrayList<Character> als = new ArrayList<Character>();
		
		als.add('q');
		als.add('w');
		als.add('b');
		als.add('q');
		als.add('w');
		als.add('t');
		
				
		System.out.println("Before remove duplicate Element in ArrayList :" +al);
		System.out.println("Before remove duplicate Element in ArrayList :" +als);
		
		
		System.out.println("ArrayList after removes dulicate elemets : " 
		+ removeElementFromArrayList(al) );
		
		System.out.println("ArrayList after removes dulicate elemets : " 
				+ removeDuplicateElement(als) );
		
		//Using Java 8 Stream.distinct():
		
		ArrayList<Integer> ali = new ArrayList<Integer>(Arrays.asList(7,2,3,5,7,8,12,10,12));
		
		List<Integer> newArrayList = ali.stream().distinct().collect(Collectors.toList());
		System.out.println("ArrayList before removes dulicate elemets : " 
				+ ali );
		System.out.println("ArrayList after removes dulicate elemets : " 
				+ newArrayList );
	
		}
	//1st way:
	static <T> ArrayList<T> removeElementFromArrayList(ArrayList<T> list){
		
		ArrayList<T> newList = new ArrayList<T>();
		
		for(T element:list){
			if(!newList.contains(element)){
				newList.add(element);
			}
		}
		return newList;
	}
	
	
//Using LinkedHashSet
	
	static <T> ArrayList<T> removeDuplicateElement(ArrayList<T> dals){
		
		Set<T> lhs = new LinkedHashSet<T>();
		
		lhs.addAll(dals);
		
		dals.clear();
		
		dals.addAll(lhs);
		
		return dals;
	}
}


