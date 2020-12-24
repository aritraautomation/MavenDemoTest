package org.qa.javaprogram;

public class SumNumbersInString {

	public static void main(String[] args) {
		
		String s = "22hh183ff3dd";
		
		System.out.println("Given String is : " + s);
		System.out.println("Sum of numbers in the given string : " + sumOfNumbers(s));
	}
	
	static int sumOfNumbers(String str){
		
		int sum =0;
		
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				String st = str.substring(i, i+1);
				sum=sum+Integer.parseInt(st);				
			}			
		}
		return sum;
	}
	
}
