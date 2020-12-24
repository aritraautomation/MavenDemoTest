package org.qa.javaprogram;

public class RevStringDemo {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		//One-way
		System.out.println("Reverse String is : " + new StringBuffer(s).reverse());
		
		//another-way:
		
		String rev = " ";
		
		for(int i=s.length()-1;i>=0;i--){
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is : " + rev);
	}

}
