package org.qa.javaprogram;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		
		int year = sc.nextInt();
		
		boolean flag = false;
		
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					flag = true;
				}else{
					flag = false;
				}
			}else{
				flag = true;
			}
		}
		
		if(flag){
			System.out.println(year + " is a leap year");
		}else{
			System.out.println(year + " is not a leap year");
		}
	}

}
