package org.qa.javaprogram;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = new int[] {2,3,4,5,6};
		int[] arr2 = new int[] {2,3,4,5,6,7};
		
		System.out.println("Is two arrays are equal : " + Arrays.equals(arr1, arr2));
	}

}
