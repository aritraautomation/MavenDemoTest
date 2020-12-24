package org.qa.javaprogram;

import java.util.Scanner;


//Verify Number can be expressed as the Sum of Two Prime Numbers:

public class CheckPrimeNumbersFactors {

	public static void main(String[] args) {
		
		//System.out.println(checkPrime(5));
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int n=sc.nextInt();
		
		boolean flag =false;
		
		for(int i=2;i<=n/2;i++){
			if(checkPrime(i)){
				if(checkPrime(n-i)){
					System.out.println(n + " = " + i + " + " + (n-i));
					flag = true;
				}
			}
		}
		
		if(!flag){
			System.out.println(n + " can not be expressed as the Sum of Two Prime Numbers" );
		}

	}
	
	static boolean checkPrime(int num){
		
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
