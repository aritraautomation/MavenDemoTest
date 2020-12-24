package org.qa.javaprogram;

public class StringRotation {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		if(areRotation(str1, str2)){
			System.out.println("Strings are rotations of each other");
		}
		else{
			System.out.println("Strings are not rotations of each other");
		}
	}
	
	static boolean areRotation(String str1, String str2){
		return (str1.length()==str2.length())&&
				(str1+str1).contains(str2);
	}

}
