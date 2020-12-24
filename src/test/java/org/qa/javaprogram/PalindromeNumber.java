package org.qa.javaprogram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num =121;
		int rev =0;
		
		int actualNumber = num;
		
		while(num!=0){
			int n = num%10;//
			rev = rev*10+n;//121
			num = num/10;//
		}
		System.out.println("Reverse Number : " + rev);
		
		if(actualNumber==rev){
			System.out.println(actualNumber + " is a Palindrome Number");
		}else{
			System.out.println(actualNumber + " is not a Palindrome Number");
		}
	}

}
