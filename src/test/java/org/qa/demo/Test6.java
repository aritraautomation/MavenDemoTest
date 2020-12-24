package org.qa.demo;

import java.util.function.Predicate;

public class Test6 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>10;
		
		System.out.println("The numbers which are even and >10");
		
		int[] arr = {10,5,30,11,25,2,6,90};
		
		for(int x:arr){
			if(p1.and(p2).test(x)){
				System.out.println(x);
			}
		}
		
		System.out.println("The numbers which are even or >10");
		
		for(int x:arr){
			if(p1.or(p2).test(x)){
				System.out.println(x);
			}
		}
		System.out.println("The numbers which are not even");
		for(int x:arr){
			if(p1.negate().test(x)){
				System.out.println(x);
			}
		}
	}

}
