package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		String arr[]= {"aA","nm","aA","Aa"};
		duplicateElementArray(arr);
		
		
		//String arr[] = {"aA","nm","aA","Aa"};
		
		/*for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate element : " + arr[i]);
				}
			}
		}*/

	}
	
	static void duplicateElementArray(String arr[]){
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(String s:arr){
			if(m.containsKey(s)){
				m.put(s, m.get(s)+1);
			}
			else{
				m.put(s, 1);
			}
		}
		
		Set<String> keys = m.keySet();
		for(String key:keys){
			if(m.get(key)>1){
				System.out.println("Duplicate element : " + key);
			}
		}
		
	}
	
}
