package org.qa.demo;

import java.util.function.Function;

public class Test7 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println("Square of number : " + f.apply(4));
		
		System.out.println("***Length of a given string***");		
		Function<String,Integer> f1=i->i.length();
		System.out.println("Length of a given String is : " + f1.apply("Harry Potter"));
		
		System.out.println("**Uppercase of given String**");
		Function<String,String> f2 = i->i.toUpperCase();
		System.out.println("Uppercase of String : " + f2.apply("durgasoftsolution"));
	}

}
