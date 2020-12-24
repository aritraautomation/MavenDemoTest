package org.qa.demo;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Test16 {

	public static void main(String[] args) {
		IntFunction<Integer> f = i->i*i;
		System.out.println(f.apply(5));
		
		ToIntFunction<String> f1 = s->s.length();
		System.out.println(f1.applyAsInt("String"));
		
		IntToDoubleFunction f2 = i->Math.sqrt(i);
		System.out.println(f2.applyAsDouble(9));
		
		UnaryOperator<Integer> f3 = i->i*i;
		System.out.println(f3.apply(4));
		
		IntUnaryOperator f4 = i->i*i;
		System.out.println(f4.applyAsInt(5));
		
		BinaryOperator<String> f5 = (s1,s2)->s1+s2;
		System.out.println(f5.apply("Aritra", " Singha"));
		
		IntBinaryOperator f6 = (i1,i2)->i1*i2;
		System.out.println(f6.applyAsInt(2, 4));
	}

}
