package org.qa.java8Sample;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		/*Predicate<Integer> p1=i->i%2==0;
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));*/
		
		//String s1="wesr";
		
		/*Predicate<String> p2=s->s.length()>5;
		System.out.println(p2.test("sdsddsdd"));*/
		
		String[] s = {"Nag","Chiranjeevi","Venkatesth","Balaiah","Sunny"};
		
		Predicate<String> p = s1->s1.length()%2==0;
		
		for(String s2:s){
			if(p.test(s2)){
				System.out.println(s2);
			}
		}
		
	}

}
