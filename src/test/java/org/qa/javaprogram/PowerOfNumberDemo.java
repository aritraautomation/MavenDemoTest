package org.qa.javaprogram;

import java.util.Scanner;

public class PowerOfNumberDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base and Exponent of Number : ");
		
		long base = sc.nextLong();
		long exponent = sc.nextLong();
		
		//1st way:
		long result = 1;
		
		while(exponent!=0){
			result*=base;
			--exponent;
		}
		
		System.out.println("Power of a Number is : " + result);
		
		//2nd way:
		
		System.out.println("Power of a Number is : " + Math.pow(base, exponent));
	}

}
