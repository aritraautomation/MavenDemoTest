package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EachCharOccuranceDemo {

	public static void main(String[] args) {
		eachCharOccurance("Aritra Singha");
	}
	
	static void eachCharOccurance(String str){
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else{
				hm.put(str.charAt(i), 1);
			}
		}
		
		Set<Character> keys = hm.keySet();
		
		for(Character key:keys){
			if(hm.get(key)>=1){
				System.out.println("Occurance of each character : " + key + "-->" + hm.get(key));
			}
		}
	}

}
