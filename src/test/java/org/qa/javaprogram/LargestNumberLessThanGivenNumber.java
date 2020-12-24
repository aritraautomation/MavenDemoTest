package org.qa.javaprogram;

import java.util.Scanner;

//How To Find Largest Number Less Than Given Number And Without Given Digit?

public class LargestNumberLessThanGivenNumber {

	public static void main(String[] args) {
		
		System.out.println(getLessThanNumber(145,4));		
	}
	
	static int getLessThanNumber(int number, int digit){
		
		char c = Integer.toString(digit).charAt(0);
		
		for(int i = number;i>0;i--){
			if(Integer.toString(i).indexOf(c)==-1){
				return i;
			}
		}
		return -1;
	}
 }
