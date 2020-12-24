package org.qa.javaprogram;

public class PallinNumberDemo {

	public static void main(String[] args) {
		
		int n=121;
		
		int rev=0;
		
		int actualNumber=n;
		
		while(n!=0){
			rev=rev*10+n%10;
			n=n/10;
		}		
		System.out.println("Reverse Number : " + rev);
		
		if(actualNumber==rev){
			System.out.println("The Number is Pallindrome Number");
		}else{
			System.out.println("The Number is not Pallindrome Number");
		}
	}

}
