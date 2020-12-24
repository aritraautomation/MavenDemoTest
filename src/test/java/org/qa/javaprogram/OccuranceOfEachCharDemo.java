package org.qa.javaprogram;

public class OccuranceOfEachCharDemo {

	static void occuranceOfEachChar(String str){
		 int counter[] = new int[256];
		 
		 for(int i=0;i<str.length();i++){
			 counter[str.charAt(i)]++;
		 }
		 
		 //creating an array with string length
		 char array[] = new char[str.length()];
		 
		 for(int i=0;i<str.length();i++){
			array[i] = str.charAt(i);//A
			
			int flag=0;
			
			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			for(int j=0;j<=i;j++)//A-A,A-R,A-I,A-T,A-R,A-A,R-A,R-R,.......
			{
				if(array[i]==array[j]){
					flag++;//1
				}
			}
			if(flag==1)
				System.out.println("Occurance of character " + str.charAt(i) + 
						" in the String is: " + counter[str.charAt(i)]);
			
		 }
		 
	}
	
	public static void main(String[] args) {
		
		String str = "ARITRA";
		occuranceOfEachChar(str);
		
	}

}
