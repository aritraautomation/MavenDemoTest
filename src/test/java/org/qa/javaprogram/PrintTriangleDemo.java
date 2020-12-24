package org.qa.javaprogram;

public class PrintTriangleDemo {

	public static void main(String[] args) {
		
		triangle(9);

	}
	
	static void triangle(int n){
		
		for(int i=0;i<n;i++){//this loop for number of rows
			for(int j=n-i;j>1;j--){
				System.out.print(" ");//this loop for number of spaces
			}
			
			for(int j=0;j<=i;j++){
				System.out.print("* ");//this loop for printing values
			}
			
			System.out.println();
		}
	}

}
