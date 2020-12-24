package org.qa.javaprogram;

public class WordOccuranceDemo {
	
	static int wordOccurance(String s, String s1){
		
		String arr[] = s.split(" ");
		
		int counter=0;
		
		for(int i=0;i<arr.length;i++){
			if(s1.equals(arr[i])){
				counter++;
			}
		}
		return counter;
		
	}

	public static void main(String[] args) {
		
		System.out.println(wordOccurance("This is Selenium is it", "is"));

	}

}
