package org.qa.demo;
import java.util.function.*;


@FunctionalInterface
interface Interf2{
	
	public int square(int a);
	default void m2(){
		
	}
}

public class Test2 {

	public static void main(String[] args) {
		Interf2 i = a-> a*a;
		System.out.println(i.square(10));
	}

}
