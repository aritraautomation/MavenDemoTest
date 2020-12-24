package org.qa.javaprogram;

import java.util.Scanner;

public class LargestNymber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter three Numbers : ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b&&a>c){
			System.out.println(a + " is the largest number");
		}else if(b>a&&b>c){
			System.out.println(b + " is the largest number");
		}else if(c>a&&c>b){
			System.out.println(c + " is the largest number");
		}else{
			System.out.println("numbers are equal");
		}		
		
	}

}
