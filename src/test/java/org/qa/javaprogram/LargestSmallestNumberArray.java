package org.qa.javaprogram;

import java.util.Arrays;

public class LargestSmallestNumberArray {

	public static void main(String[] args) {
		int[] arr = {2,-9,3,10,16,8};
	
		//1st way
		int largest = arr[0];
		int secondLargest = arr[0];
		int smallest = arr[0];
		int secondSmallest = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<smallest){
				secondSmallest = smallest;
				smallest=arr[i];
			}
		}
		System.out.println("Largest number in array : " + largest);
		System.out.println("Second Largest number in array : " + secondLargest);
		System.out.println("Smallest number in array : " + smallest);
		System.out.println("Second Smallest number in array : " + secondSmallest);
		
		
		
		//2nd way:It will nor work if array contains duplicate value
		System.out.println("***Sorting technique******");
		
		Arrays.sort(arr);
		System.out.println("Largest number in array : " + arr[arr.length-1]);
		System.out.println("2nd Largest number in array : " + arr[arr.length-2]);
		System.out.println("Smallest number in array : " + arr[0]);
		System.out.println("Second Smallest number in array : " + arr[1]);
		
	}

}
