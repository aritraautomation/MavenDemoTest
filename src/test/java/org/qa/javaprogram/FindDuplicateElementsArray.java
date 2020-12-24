package org.qa.javaprogram;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateElementsArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,9,4,9,2};		
		
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){				
				if(arr[i]==arr[j]){
					System.out.println("Duplicate Elements in Array : " 
				+ arr[i]);				
				}				
			}
			
		}
		
		duplicateElelemnts(arr);
		
	}
	
	static void duplicateElelemnts(int arr[]){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(Integer ar:arr){
			if(hm.containsKey(ar)){
				hm.put(ar, hm.get(ar)+1);
			}
			else{
				hm.put(ar, 1);
			}
		}
		
		Set<Integer> keys = hm.keySet();
		
		for(Integer key:keys){
			if(hm.get(key)>1){
				System.out.println("Duplicate Element --> " +key + " : "  +
			hm.get(key));
			}
		}
	}

}
