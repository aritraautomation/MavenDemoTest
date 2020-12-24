package org.qa.javaprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayElements {
	
	//Reverse an integr Array:
	
/*	public static void reverseArray(int arr[], int start, int end){
		int temp;
		
		while(start<end){
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : " );
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter number in Array : " );
		
		for(int k=0;k<n;k++){
			
			arr[k] = sc.nextInt();
			
		}
		
		
		
		//int [] arr = {2,4,1,33,45};
		
		System.out.println("Printing an array before reverse : " );
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
			
		int start = 0;
		int end = arr.length-1;
		
		reverseArray(arr,start,end);
		
		System.out.println("Printing an array after reverse : " );
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}*/
		

	
	public static void reverseStringArray(String arr[], int start, int end){
		String temp;
		
		while(start<end){
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}
	
	//Reverse a String Array:
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : " );
		
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		System.out.println("Enter number/String in Array : " );
		
		for(int k=0;k<n;k++){
			arr[k] = sc.next();
		}
		
		System.out.println("Printing an array before reverse : " );
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
			
		int start = 0;
		int end = arr.length-1;
		
		reverseStringArray(arr,start,end);
		
		System.out.println("Printing an array after reverse : " );
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		
		//another -way:
		
				/*System.out.println("Another-way of reverse an array");
				Integer a[] = {2,44,9,55,6};
				//String a[] = {"is","the","fall","back"};
				Collections.reverse(Arrays.asList(a));
				System.out.println(Arrays.asList(a)); //output:[6, 55, 9, 44, 2]
*/		
	}
}



