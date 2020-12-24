package org.qa.javaprogram;

import java.util.HashSet;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		System.out.println(firstRepeatedCharacter("geeksforgeeks"));

	}
	
	static char firstRepeatedCharacter(String str){
		
		HashSet<Character> hs = new HashSet<Character>();
		
		char[] chr = str.toCharArray();
		
		for(Character ch:chr){
			if(hs.contains(ch)){
				return ch;
			}
			else{
				hs.add(ch);
			}
		}
		return '\0';
	}

}
