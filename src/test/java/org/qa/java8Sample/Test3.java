package org.qa.java8Sample;

interface Interf3{
	public int squreIt(int n);
}
public class Test3 {

	public static void main(String[] args) {
		
		Interf3 i = n->n*n;
		System.out.println(i.squreIt(4));
		System.out.println(i.squreIt(5));
		System.out.println(i.squreIt(6));
		System.out.println(i.squreIt(7));
	}

}
