package org.qa.javasample;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="@#@#$@$String122";
		String s1="$$%#$abcvFG901anht%^%&^%&^%&";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
