package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("AA","DD","SS","AA","BB","SS"));
		duplicateElementArrayList(al);
	}
	
	static void duplicateElementArrayList(ArrayList<String> al){
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i=0;i<al.size();i++)
		{
			if(m.containsKey(al.get(i))){
				m.put(al.get(i), m.get(al.get(i))+1);
			}
			else{
				m.put(al.get(i), 1);
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