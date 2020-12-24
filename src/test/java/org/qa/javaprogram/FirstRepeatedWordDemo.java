package org.qa.javaprogram;

import java.util.HashSet;

public class FirstRepeatedWordDemo {

	public static void main(String[] args) {
		
		System.out.println(firstRepeatedWord("Ravi had been saying that he had been there"));

	}
	
	static String firstRepeatedWord(String str){
		HashSet<String> hs = new HashSet<String>();
		
		 String[] arr = str.split(" ");
		 
		 for(String s:arr){
			 if(hs.contains(s)){
				 return s;
			 }
			 else{
				 hs.add(s);
			 }
		 }
		 
		 return "\0";
	}

}
