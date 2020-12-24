package org.qa.javaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("ÄB");
		al.add("NM");
		al.add("BG");
		al.add("ÄB");
		al.add("KX");
		al.add("ÄB");
		al.add("KX");
		
		
		findDuplicateElements(al);
	}
	
	static void findDuplicateElements(ArrayList<String> al){
		
		Map<String,Integer> map = new HashMap<String,Integer>();
	
		for(String str:al){
			if(map.containsKey(str)){
				map.put(str, map.get(str)+1);
			}
			else{
				map.put(str, 1);
			}
		}
		
		Set<String> keys = map.keySet();
		
		for(String str:keys){
			if(map.get(str)>1){
				System.out.println("Duplicate Element " + str + " : " + map.get(str) + " times");
			}
		}
	}

}
