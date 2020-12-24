package org.qa.javaprogram;

//remove all white spaces from a string in java 
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String s = "As it is ehe weew wewerwerwerwe wewre";
		
		
		//one way:
		
		String[] arr = s.split(" ");
		
		String str = "";

		for(int i = 0;i<arr.length;i++){
			str = str + arr[i];
		}
		
		System.out.println(str);
		
		//another way:
		
		System.out.println(s.replaceAll("\\s", ""));
		
	}

}
