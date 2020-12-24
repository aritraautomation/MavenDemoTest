package org.qa.javaprogram;

public class ValidateAlphabet {

	public static void main(String[] args) {
		char c = 'e';
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')){
			System.out.println(c + " is a Alphabet");
		}else{
			System.out.println(c + " is not a Alphabet");
		}
	}

}
