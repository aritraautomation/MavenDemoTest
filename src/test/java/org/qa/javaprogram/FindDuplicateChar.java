package org.qa.javaprogram;

import java.util.HashMap;
import java.util.Set;


//find duplicate characters in a string in java

public class FindDuplicateChar {

	public static void main(String[] args) {
		duplicateCharacters("BeginnersBook.com");
	}
	
	static void duplicateCharacters(String str){
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		char[] chars = str.toCharArray();
		
		for(Character ch:chars){
			
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);
			}
			
		}
		
		Set<Character> keys =hm.keySet();
		
		for(Character ch:keys){
			if(hm.get(ch)>1){
				System.out.println("Char " + ch + " " + hm.get(ch));
			}
		}		
		
	}

}
