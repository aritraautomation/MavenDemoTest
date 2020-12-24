package org.qa.java8Sample;

import java.util.function.*;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=i->i*i;
		System.out.println(f1.apply(5));
		
		Function<String,Integer> f2=s->s.length();
		System.out.println(f2.apply("Surga1"));
	}
}
