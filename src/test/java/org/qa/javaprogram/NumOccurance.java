package org.qa.javaprogram;

public class NumOccurance {

	static long numOccurance(long n, long n1){
		long counter = 0;
		
		while(n!=0){
			if(n%10==n1){
				counter++;
			}
			n=n/10;			
		}
		return counter;
	}
	
	public static void main(String[] args) {
		
		System.out.println(numOccurance(425505053,5));
	}

}
