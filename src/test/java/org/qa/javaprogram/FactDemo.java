package org.qa.javaprogram;

import java.util.Scanner;

public class FactDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++){
			fact = fact*i;
		}
		
		System.out.println("Fctorial of " + n + " : " + fact);
	}

}
