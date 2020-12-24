package org.qa.javaprogram;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "GeeksForGeeks";
		
		String s2 = "GeeksForGeekss";
		
		//System.out.println("Is two Strings are equal : " + s1.equals(s2));
		
		if(s1.equalsIgnoreCase(s2)==true){
			System.out.println("Both Strings are same");
		}
		else{
			System.out.println("Both Strings are not same");
		}
	}

}
