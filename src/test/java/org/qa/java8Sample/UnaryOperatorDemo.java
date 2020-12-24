package org.qa.java8Sample;

import java.util.function.*;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> f = i->i*i;
		
		System.out.println(f.apply(7));
		
		
		IntUnaryOperator f1 = i->i*i;
		System.out.println(f1.applyAsInt(4));
	}

}
