package org.qa.javaprogram;


public class Test111 {
	
	public static int occuranceWord(String s, String word){

		String[] arr = s.split(" ");
		
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(word.equals(arr[i])){
				count++;
			}	
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(occuranceWord("aritra is test is cricket","is"));
	}
}


