package org.qa.javaprogram;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		//2^5 = 32
		
		////1st way to find power of a number
		int base = 2;
		int exponent = 5;
		
		int result=1;
		
		while(exponent!=0){
			result*=base;//result=result*base
			exponent--;
		}	
		
		System.out.println("Power of Number : " + result);
		
		//2nd way to find power of a number
		//System.out.println("Power of Number : " + Math.pow(2, 5));
		
	}

}
