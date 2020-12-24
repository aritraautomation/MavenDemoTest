package org.qa.javasample;

import java.util.concurrent.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap m = new ConcurrentHashMap();
		
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		
		System.out.println(m);
		 
		Iterator itr = m.entrySet().iterator();
		
		
		
		System.out.println(m);
		
		while(itr.hasNext()){
			Map.Entry it = (Map.Entry)itr.next();
			//System.out.println(it);   //1=A,2=B,3=C
			String value = (String)it.getValue();
			
			m.put(4,"D");
			System.out.println(it.getKey() +  " : " + value); 
		}
	}
}
