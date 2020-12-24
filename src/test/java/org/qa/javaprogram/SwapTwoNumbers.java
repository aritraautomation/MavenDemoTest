package org.qa.javaprogram;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int temp;
		
		System.out.println("Value of a before swapping : " + a);
		System.out.println("Value of b before swapping : " + b);
		
		
		/*temp=a;
		a=b;
		b=temp;*/
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		
		System.out.println("Value of a after swapping : " + a);
		System.out.println("Value of b after swapping : " + b);
	}

}
