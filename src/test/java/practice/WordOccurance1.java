package practice;

public class WordOccurance1 {

	public static void main(String[] args) {
		String str = "My name is Aritra is Singha is TEst that is that";
		String word = "is";
		wordOccurance(str,word);

	}
	
	static void wordOccurance(String str,String word){
		
		String arr[] = str.split(" ");
		int counter = 0;
		for(int i=0;i<arr.length;i++){
			if(word.equals(arr[i])){
				counter++;				
			}
			
		}
		System.out.println("Occurance word is : " + word );
		System.out.println("The number of occurance is : " + counter);
		
		
	}

}
