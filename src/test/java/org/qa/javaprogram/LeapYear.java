package org.qa.javaprogram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	//divisible by 4 for all century years --ending with 00
	//century is a leap year only when it is perfectly divisible by 400
	//1900 is not a leap year
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		
		int year = scan.nextInt();
		
		boolean leap=false;
		
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					leap = true;
				}else{
					leap = false;
				}
			}else{
				leap = true;
				}
		}else{
			leap = false;
			}
		
		if(leap){
			System.out.println(year + " is a leap year");
		}else{
			System.out.println(year + " is not a leap year");
		}
	}

}
