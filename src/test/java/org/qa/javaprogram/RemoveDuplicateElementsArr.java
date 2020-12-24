package org.qa.javaprogram;

//Remove duplicate elements from an array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveDuplicateElementsArr {

	public static void main(String[] args) {
		String[] arr = {"AA","FR","AA","CD","FR"};
		
		int[] my_array = {11,20,22,20,30,33,45,11};
		
		//1st way:
		/*ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));		
		Set<String> set = new LinkedHashSet<String>(al);		
		al.clear();		
		al.addAll(set);		
		System.out.println(al);
		
		Object[] ob = al.toArray();
		for(Object obj:ob){
			System.out.print(obj + " "); 
		}*/
		//System.out.println("Removed Duplicate from Array :" + al.toArray());
		
		//2nd way:
		
		unique_array(my_array);
	}
	
	static void unique_array(int[] my_array){
		
		//original array:
		
		for(int i=0;i<my_array.length;i++){
			System.out.print(my_array[i]+"\t");
		}
		//Assuming all elements in input array are unique
		int unique_array_element = my_array.length;
		
		 //Comparing each element with all other elements
		for(int i=0;i<unique_array_element;i++){
			for(int j=i+1;j<unique_array_element;j++){
				//if two elements are found equal
				if(my_array[i]==my_array[j]){
					
					//Replace duplicate element with last unique element
					my_array[j] = my_array[unique_array_element-1];
					
					unique_array_element --;
					
					j--;					
				}
			}
		}
		
		//Copying only unique elements of my_array into array1
		
		int array1[] = Arrays.copyOf(my_array, unique_array_element);
		
		//Printing arrayWithoutDuplicates
        
        System.out.println();
         
        System.out.println("Array with unique values : ");
        
        for(int i=0;i<array1.length;i++){
        	System.out.print(array1[i]+"\t");
        }
        
        System.out.println();
        
        System.out.println("---------------------------");
	}

}
