package org.qa.javaprogram;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args){
			
		Scanner scan = new Scanner(System.in);		
		System.out.println("Please enter integer number: ");		
		int a = scan.nextInt();				
		System.out.println("You have entered integer: " + a);		
	}
}
