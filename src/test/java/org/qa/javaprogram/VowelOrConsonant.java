package org.qa.javaprogram;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Alphabet : ");
		
		String s= scan.nextLine();
		Character c =(Character)s;*/
		
		char ch = 'e';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println(ch + " is Vowel");
		}else{
			System.out.println(ch + " is Consonant");
		}
	}

}
