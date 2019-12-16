package org.qa.javasample;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 12345;		
		int rev1 =0;
		
		while(num!=0){
			rev1=rev1*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev1);
		
		
		
		//Using loop
				int x= 7347343;
				String s=String.valueOf(x);
				String rev="";
				
					for (int i=s.length()-1;i>=0;i--)
					{
						rev = rev+s.charAt(i);
					
					}
				
				System.out.println(Integer.parseInt(rev));
}
}