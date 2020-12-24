package org.qa.javaprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 45639;
		//String rev = "";
		
		int rev=0;
		
		while(num!=0){
			rev = rev*10+ num%10;				
			num = num/10;     
		}
		System.out.println("Reverse Number is " + rev);
		
		//Another way
		int num1 = 363767;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	

}
