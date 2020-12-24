package org.qa.javaprogram;

public class VerifyNumberOrString {

	public static void main(String[] args) {
		String str = "10276";
		
		if(isNumber(str)){
			System.out.println("Input is a Number");
		}
		else{
			System.out.println("Input is a String");
		}
	}
	
	static boolean isNumber(String str){
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))==false){
				return false;
			}
		}
		return true;
		
	}

}
