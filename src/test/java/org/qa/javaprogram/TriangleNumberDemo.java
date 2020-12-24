package org.qa.javaprogram;

//create a pyramid of numbers in java..

public class TriangleNumberDemo {

	public static void main(String[] args) {
		numericTriangle(9);
	}
	
	static void numericTriangle(int n){
		
		int count=1;
		
		for(int i=0;i<n;i++){
			
			for(int j=n-i;j>1;j--){
				System.out.print(" ");	
			}
			
			for(int j=1;j<=count;j++){
				System.out.print(count + " ");
			}
			System.out.println();
			count++;
		}
	}

}
