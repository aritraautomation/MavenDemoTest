package practice;

public class DuplicateChar1 {

	public static void main(String[] args) {
		duplicateChar("Aritra",'r');

	}
	
	static void duplicateChar(String str,Character ch){
		int counter = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				counter++;
			}
		}
		System.out.println("Duplicate character and number of occurance is : " + ch + ":" + counter);
		
	
	}

}
