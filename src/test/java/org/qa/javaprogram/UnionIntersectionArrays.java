package org.qa.javaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

//How to find Union and Intersection of two arrays in java?

public class UnionIntersectionArrays {

	public static void main(String[] args) {
		
		int arr1[] = {7, 1, 5, 2, 3, 6};
		int arr2[] = {3, 8, 6, 20, 7};
		
		union(arr1,arr2);
		
		System.out.println("Intersection of two Arrays : ");
		intersection(arr1,arr2);

	}
	
	static void union(int[] arr1, int[] arr2){
		
		HashSet hs = new HashSet();
		
		for(int i=0;i<arr1.length;i++){
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++){
			hs.add(arr2[i]);
		}
		
		System.out.println("Union of two arrays : " + hs);
	}
		
		static void intersection(int[] arr1, int[] arr2){
			HashSet hs = new HashSet();
		
			for(int i=0;i<arr1.length;i++){
				hs.add(arr1[i]);
			}
			
			for(int i=0;i<arr2.length;i++){
				if(hs.contains(arr2[i])){
					System.out.print(arr2[i]+ " ");
				}
								
			}
		}
}
