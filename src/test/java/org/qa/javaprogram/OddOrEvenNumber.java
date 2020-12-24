package org.qa.javaprogram;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int value = scan.nextInt();
		
		if(value%2==0){
			System.out.println(value + " is EvenNumber");
		}else{
			System.out.println(value + " is OddNumber");
		}
		
	/*	IntPredicate p = v->v%2==0;
		System.out.println(p.test(value));*/
	}

}
