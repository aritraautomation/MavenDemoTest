package org.qa.javaprogram;

public class CharOccuranceDemo {
	
	static int charOccurance(String s, char ch){
		
		int counter=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==ch){
				counter++;
			}
		}
		return counter;
		
	}

	public static void main(String[] args) {
		System.out.println(charOccurance("This is Selenium is it",'i'));
	}

}
