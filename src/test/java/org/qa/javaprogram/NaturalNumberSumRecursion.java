package org.qa.javaprogram;

import java.util.Scanner;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		int sum = add(n);
		
		System.out.println("Sum of Natural Numbers using Recursion method : " + sum );

	}
	
	static int add(int num){
		if(num!=0){
			return num+add(num-1);
		}else{
			return num;
		}
	}

}
