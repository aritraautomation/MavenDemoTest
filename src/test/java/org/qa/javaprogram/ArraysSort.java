package org.qa.javaprogram;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {
		Integer[] arr = {22,3,43,0,1,23,22};
		
		String[] arr1 = {"Shyam","Patel","Hari","Peter"};
		
		
		//Ascending order sorting:
		Arrays.sort(arr);		
		Arrays.sort(arr1);
		
		System.out.println("Ascending sorting order : "  + Arrays.toString(arr) );
		System.out.println("Ascending sorting order as per Alphabetical : "  + Arrays.toString(arr1) );
		
		//Descending order sorting:
		Arrays.sort(arr,Collections.reverseOrder());
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println("Descending sorting order : "  + Arrays.toString(arr) );
		System.out.println("Descending sorting order as per Alphabetical : "  + Arrays.toString(arr1) );
	}

}
