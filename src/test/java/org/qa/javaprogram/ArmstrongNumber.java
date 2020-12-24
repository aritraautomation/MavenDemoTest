package org.qa.javaprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		//int num = 153;
		int actualNumber=num;
		double result =0;
				
		while(num!=0){
			
			int n = num%10;//3,5,1	
			
			result=result+Math.pow(n, 3);	////3^3+5^3+1^3	
			
			num=num/10;			
		}
		
		System.out.println(result);
		
		
		if(actualNumber==result){
			System.out.println(actualNumber + " is a Armstrong Number");
		}else{
			System.out.println(actualNumber + " is not a Armstrong Number");
		}
		
	}

}
