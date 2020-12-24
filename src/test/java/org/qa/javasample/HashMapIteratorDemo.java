package org.qa.javasample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "A");
		hm.put(2, "B");
		
		System.out.println("***Using for Iterator***");
		Iterator itr = hm.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(" [Key] : " + entry.getKey() + "[Value] : " + entry.getValue() );
		}
		
		
		System.out.println("***Using for entrySet()***");
		
		for(Map.Entry entry:hm.entrySet()){
			System.out.println(" [Key] : " + entry.getKey() + "[Value] : " + entry.getValue() );
			
		
		System.out.println("***Using Java 8 forEach loop***");
		
		hm.forEach((key, value)-> System.out.println(" [Key] : " + key + "[Value] : " + value) );

		}
		
	}

}
