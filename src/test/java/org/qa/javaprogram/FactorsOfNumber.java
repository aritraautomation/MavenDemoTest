package org.qa.javaprogram;

import java.util.Scanner;

public class FactorsOfNumber {
	
	/*"Factors" are the numbers you multiply to get another number. For instance, factors of 15 are 3 and 5, 
	because 3×5 = 15. Some numbers have more than one factorization (more than one way of being factored). 
	For instance, 12 can be factored as 1×12, 2×6, or 3×4.*/
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);		
		System.out.println("Enter the Number : ");		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i + "  ");
				}
				
			}
			
			
		}
		
		
		
	}

