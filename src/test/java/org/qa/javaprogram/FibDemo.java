package org.qa.javaprogram;

import java.util.Scanner;

public class FibDemo {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8....
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : " );
		
		int range = sc.nextInt();
		
		int x=0,y=1;
				
		for(int i=1;i<=range;i++){
			
			System.out.print(x + " ");
			
		    int sum=x+y;
			x=y;
			y=sum;
		}
	}

}
