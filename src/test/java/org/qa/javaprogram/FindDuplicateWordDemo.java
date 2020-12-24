package org.qa.javaprogram;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWordDemo {

	public static void main(String[] args) {
		duplicateWord("Ravi had been saying that he had been there been");
	}
	
	static void duplicateWord(String str){
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		String[] st = str.split(" ");
		
		for(String s:st){
			if(hm.containsKey(s)){
				hm.put(s, hm.get(s)+1);
			}
			else{
				hm.put(s, 1);
			}
		}
		
		Set<String> keys = hm.keySet();
		
		for(String s:keys){
			if(hm.get(s)>1){
				
				System.out.println(s + " : " + hm.get(s));
				
			}
		}
	}

}
