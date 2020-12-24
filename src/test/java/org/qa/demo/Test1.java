package org.qa.demo;
import java.util.function.*;

@FunctionalInterface
interface Interf1 {	
	public void add(int a, int b);
}

class Test1{
	public static void main(String args[]){
		Interf1 i1 = (a,b)->System.out.println(a+b);
		i1.add(10,20);
	}	
}