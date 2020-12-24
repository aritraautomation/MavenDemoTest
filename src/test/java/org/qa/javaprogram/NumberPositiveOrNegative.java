package org.qa.javaprogram;

import java.util.Scanner;

public class NumberPositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		double num = scan.nextDouble();
		
		if(num>0){
			System.out.println(num + " is a positive number");
		}else if(num<0){
			System.out.println(num + " is a negative number");
		}else{
			System.out.println(num + " is a zero number");
		}
	}

}
