package org.qa.java8Sample;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		int[] x = {0,2,10,25,27,20,30,40,41};
		
		IntPredicate p = i->i%2==0;
		
		for(int x1: x){
			if(p.test(x1)){
				System.out.println(x1);
			}
		}

	}

}
