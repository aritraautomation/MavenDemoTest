package org.qa.java8Sample;

interface Interf1{
	public void add(int a, int b);
}

public class Test2 {

	public static void main(String[] args) {
		
		Interf1 i = (a,b)-> System.out.println("Sum of two values : " + (a+b));
		i.add(10,20);
	}

}
