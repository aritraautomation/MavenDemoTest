package org.qa.javasample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentWord {
	
	public static String frequentWord(String[] arr){
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else{
				hm.put(arr[i], 1);
			}
		}
		String key = "";
		int value = 0;
		
		for(Map.Entry<String,Integer>entry :hm.entrySet()){
			if(entry.getValue()>value){
				value=entry.getValue();
				key=entry.getKey();
			}
		}
		return key;
	}

	public static void main(String[] args) {
		
		String arr[] = { "geeks", "for", "geeks", "a", 
                "portal", "to", "learn", "can", "be", 
                "computer", "science", "zoom", "yup", 
                "fire", "in", "be", "data", "geeks" };
		
		String sol = frequentWord(arr);
		
		System.out.println(sol);
	}

}

	