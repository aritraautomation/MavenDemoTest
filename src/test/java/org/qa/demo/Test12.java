package org.qa.demo;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test12 {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (a,b)->(a+b)%2==0;
		
		System.out.println(p.test(10, 20));//true
		System.out.println(p.test(2, 3));//false
		
		
		BiFunction<Integer,Integer,Integer> f = (x,y)->(x+y)*2;
		System.out.println(f.apply(2, 5));
	}

}
