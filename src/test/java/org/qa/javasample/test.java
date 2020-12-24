package org.qa.javasample; 

public class test {
	 
			  public static void main(String args[]) {
		    	
		    	int i = 0;
				boolean t = true;
				boolean f = false, b;
				b = (t & ((i++) == 0));
				b = (f & ((i+=2) > 0));
				System.out.println(i);
		    	
		    }
		        
}
 //||--> If left condition is true, then right condition will not be executed
 //||--> If left is false, then right condition will be executed 
 
//|--> Both side will be executed irrespective of left condition is True/False.

 
 ///&&-->If left condition is true, then right condition will be executed
//&&--> If left is false, then right condition will not be executed 
 
//&--> Both side will be executed irrespective of left condition is True/False.
