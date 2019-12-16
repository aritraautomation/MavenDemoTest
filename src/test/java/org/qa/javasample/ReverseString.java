package org.qa.javasample;

public class ReverseString {

	public static void main(String[] args) {
		
		//Using loop
		String s="Manual";
		String rev="";
		
			for (int i=s.length()-1;i>=0;i--)
			{
				rev = rev+s.charAt(i);//l,la,lau
			
			}
		System.out.println(rev);
				
		
		//Using StringBuffer
		StringBuffer sb = new StringBuffer("Manual");
		System.out.println(sb.reverse());

	}

}
