package org.qa.demo;

import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i->i%2 ==0;
		
		System.out.println(p1.test(10));//o/p:true
		System.out.println(p1.test(15));//o/p:false
		
		
	
		System.out.println("****print names whose length is greater than 5 using Predicate****");
		/*System.out.println(p2.test("Satish"));
		System.out.println(p2.test("Peter"));*/
		
		String[] s1 = {"Satish","Harry","Abhisekh","Peterson"};
		Predicate<String> p2 = i->i.length()>5;
		
		for(String s:s1){
			if(p2.test(s)){
				System.out.println(s);
			}
		}
		
				
	}

}
