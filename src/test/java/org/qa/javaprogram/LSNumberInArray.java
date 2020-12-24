package org.qa.javaprogram;

public class LSNumberInArray {

	public static void main(String[] args) {

		int[] x = {2,3,10,5,9,0,-1,4};
		
		//int[] x = {2,-9,3,10,16,8};
		
		int largest = x[0];
		int secondLargest = x[0];
		int smallest = x[0];
		int secondSmallest = x[0];
		
		for(int i=1;i<x.length;i++){
			if(x[i]>largest){
				secondLargest=largest;
				largest=x[i];								
			}
			else if(x[i]<smallest){
				secondSmallest=smallest;
				smallest=x[i];
			}
		}
		System.out.println("Largest Number : " + largest);
		System.out.println("SecondLargest Number : " + secondLargest);
		System.out.println("Smallest Number : " + smallest);
		System.out.println("SecondSmallest Number : " + secondSmallest);
		
		
	}

}
