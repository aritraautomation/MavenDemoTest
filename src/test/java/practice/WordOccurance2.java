package practice;

import java.util.HashMap;
import java.util.Set;

public class WordOccurance2 {

	public static void main(String[] args) {
		occuranceOfWord("My name is Aritra is Singha is TEst that is that");
	}
	
	static void occuranceOfWord(String str){
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		String[] arr = str.split(" ");
		
		for(int i =0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}else{
				hm.put(arr[i], 1);				
			}
		}
		
		Set<String> keys = hm.keySet();
		
		for(String key:keys){
			if(hm.get(key)>1){
				System.out.println("Duplicates word and number of occurance is : " 
						+ key + " : " +  hm.get(key));
			}
		}
		
		
	}

}
