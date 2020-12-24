package org.qa.javaprogram;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		
		int num = 100;
		int sum = 0;
		
		for(int i=0;i<=num;i++){
			sum = sum + i;
		}
		System.out.println("Sum of Natural Numbers is " + sum );
	}

}
