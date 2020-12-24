package org.qa.javaprogram;

import java.util.Arrays;

public class AnagramOfStringDemo {

	public static void main(String[] args) {
		
		String s1 = "LISTEN";
		String s2 = "SILENT";
		
		if(anagram(s1,s2)){
			System.out.println("Two Strings are anagram to each other");
		}
		else{
			System.out.println("Two Strings are not anagram to each other");
		}
	}
	
	static boolean anagram(String s1,String s2){
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length!=ch2.length){
			return false;
		}
		
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch2[i]){
				return false;
			}
		}
		return true;
	}

}
