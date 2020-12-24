package org.qa.javaprogram;

public class OccuranceNumber {
	
	static int occuranceNo(int n, int n1){
		int count=0;
		while(n!=0){
			if(n%10==n1){
			count++;
			}
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(occuranceNo(123435,3));
		
	}

}
