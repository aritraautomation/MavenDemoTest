package org.qa.javaprogram;

public class OccuranceOfCharactersDemo1 {

	public static int occuranceOfChar(String str, char ch){
		
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String str = "Aritra";
		char ch = 'r';
		
		System.out.println(occuranceOfChar(str,ch));
		
		
}

}
