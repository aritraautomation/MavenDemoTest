package org.qa.javaprogram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		int num = scan.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++){
				fact = fact*i; //1*1=1,1*2=2,2*3=6,6*4=24				
			}
			System.out.println("Factorial of " + num + " is " + fact);			
		}	
}

	